package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.Recursion;
import org.junit.Test;

public class RecursionTest {

    @Test
    public void testRecursion1(){
        Recursion recursion = new Recursion();

        System.out.print(recursion.countdown(5));
    }
}
