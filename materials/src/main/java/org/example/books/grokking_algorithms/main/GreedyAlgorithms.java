package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.*;

public class GreedyAlgorithms {

    public LinkedHashMap<String, Set<String>> stations = new LinkedHashMap<String, Set<String>>();
    public HashSet<String> statesNeeded = new HashSet<>();

    public void setStatesNeeded(String[] set) {
        statesNeeded = new HashSet<>(Arrays.asList(set));
    }

    public HashSet<String> findASet() {
        HashSet<String> finalStations = new HashSet<String>();

        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            var statesCovered = new HashSet<String>();

            for (var station : stations.entrySet()) {
                var covered = new HashSet<>(statesNeeded);
                covered.retainAll(station.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }
            statesNeeded.removeIf(statesCovered::contains);

            if (bestStation != null) {
                finalStations.add(bestStation);
            }
        }

        return finalStations;
    }
}