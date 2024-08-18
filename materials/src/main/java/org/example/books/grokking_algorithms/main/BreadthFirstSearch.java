package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.*;
public class BreadthFirstSearch {

    private static Map<String, List<String>> graph = new HashMap<>();

    public boolean search(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        // This list is how you keep track of which people you've searched before.
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            // Only search this person if you haven't already searched them
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    // Marks this person as searched
                    searched.add(person);
                }
            }
        }

        return false;
    }

    public void put(String string, List<String> list){
        graph.put(string, list);
    }

    public void put(String string){
        graph.put(string, Collections.emptyList());
    }



    private static boolean person_is_seller(String name) {
        return name.endsWith("m");
    }
}
