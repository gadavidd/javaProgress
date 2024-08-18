package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.Quicksort;
import org.junit.Test;

import java.util.Arrays;

public class QuicksortTest {

    @Test
    public void testQuicksort1(){
        Quicksort quicksort = new Quicksort();

        System.out.println(quicksort.loopSum(new int[]{1,2,3,4}));// 10
    }

    @Test
    public void testQuicksort2(){
        Quicksort quicksort = new Quicksort();

        System.out.println(quicksort.recursiveSum(new int[]{1, 2, 3, 4})); // 10
    }

    @Test
    public void testQuicksort3() {
        Quicksort quicksort = new Quicksort();

        System.out.println(quicksort.recursiveCount(new int[]{0,1,2,3,4,5})); //6
    }

    @Test
    public void testQuickSort4(){
        Quicksort quicksort = new Quicksort();

        System.out.println(quicksort.recursiveMax(new int[]{1, 5, 10, 25, 16, 1}));//25
    }

    @Test
    public void testQuickSort5(){
        Quicksort quicksort = new Quicksort();

        System.out.println(quicksort.quicksort(Arrays.asList(10, 5, 2, 3))); // [2, 3, 5, 10]
    }
}
