package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.*;

public class DijkstrasAlgorithm {
    // the graph
    public Map<String, Map<String, Double>> graph = new HashMap<>();
    public Map<String, Double> costs = new HashMap<>();
    public Map<String, String> parents = new HashMap<>();
    private static List<String> processed = new ArrayList<>();

    private static String findLowestCostNode(Map<String, Double> costs) {
        Double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;

        for (Map.Entry<String, Double> node : costs.entrySet()) {
            Double cost = node.getValue();
            if (cost < lowestCost && !processed.contains(node.getKey())) {
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }

        return lowestCostNode;
    }

    public void findLowestCostNode(){
        String node = findLowestCostNode(costs);

        while(node !=null){
            Double cost = costs.get(node);

            Map<String, Double> neighbors = graph.get(node);

            for (String n : neighbors.keySet()) {
                double newCost = cost + neighbors.get(n);
                if (costs.get(n) > newCost) {
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);

            node = findLowestCostNode(costs);
        }
    }

}
