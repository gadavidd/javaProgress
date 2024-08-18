package materials.src.main.java.org.example.books.grokking_algorithms.main;

// this version uses raw arrays instead of ArrayList
public class SelectionSort2 {

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}