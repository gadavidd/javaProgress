package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));

            arr.remove(smallest);
        }

        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
