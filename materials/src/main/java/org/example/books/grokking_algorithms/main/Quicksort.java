package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;

public class Quicksort {

    public int loopSum(int[] array) {
        int total = 0;
        for (int x = 0; x < array.length; x++) {
            total += array[x];
        }

        return total;
    }

    public int recursiveSum(int[] array){
        if(array.length == 0){
            return 0; //case-base;
        } else {//Case-Recursive
            return array[0] + recursiveSum(Arrays.copyOfRange(array, 1, array.length));
        }

    }

    public int recursiveCount(int[] list){
        if (list.length == 0){
            return 0;
        }

        return 1 + recursiveCount(Arrays.copyOfRange(list, 1, list.length));
    }

    public int recursiveMax(int[] list){
        if(list.length == 2){
            return list [0] > list[1] ? list[0]:list[1];
        }

        int subMax = recursiveMax(Arrays.copyOfRange(list, 1, list.length));
        return list[0]> subMax ? list[0] : subMax;
    }

    public List<Integer> quicksort(List<Integer> list){
        if(list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);
            List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                    .collect(Collectors.toList());
            List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                    .collect(Collectors.toList());

            return Stream.of(
                            quicksort(less).stream(),
                            Stream.of(pivot),
                            quicksort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }

}
