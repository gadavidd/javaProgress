package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.SelectionSort;
import materials.src.main.java.org.example.books.grokking_algorithms.main.SelectionSort2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortTest {

    @Test
    public void testSelectionSort1() {
        SelectionSort selectionSort = new SelectionSort();

        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort.selectionSort(arr)); //[2, 3, 5, 6, 10]
    }

    @Test
    public void testSelection2Sort1() {
        SelectionSort2 selectionSort2 = new SelectionSort2();
        int[] arr = {5, 3, 6, 2, 10};

        System.out.println(Arrays.toString(selectionSort2.selectionSort(arr))); // [2, 3, 5, 6, 10]
    }
}
