package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.GreedyAlgorithms;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class GreedyAlgorithmsTest {

    @Test
    public void GreedyAlgorithmsTest1() {
        GreedyAlgorithms greedyAlgorithms = new GreedyAlgorithms();

        greedyAlgorithms.setStatesNeeded(new String[]{"mt", "wa", "or", "id", "nv", "ut", "ca", "az"});

        greedyAlgorithms.stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        greedyAlgorithms.stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        greedyAlgorithms.stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        greedyAlgorithms.stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        greedyAlgorithms.stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        System.out.println(greedyAlgorithms.findASet()); // [ktwo, kone, kthree, kfive]
    }
}



