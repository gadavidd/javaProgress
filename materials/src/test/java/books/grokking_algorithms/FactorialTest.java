package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void fact1Test(){
        Factorial factorial = new Factorial();

        System.out.print(factorial.fact(5));
    }

    @Test
    public void fact2Test(){
        Factorial factorial = new Factorial();

        System.out.println("The factorial of 5 is " + factorial.getFactorial(5));
    }

    @Test
    public void testIsZeroOrOne() {
        Factorial factorial2 = new Factorial();

        Assert.assertEquals(true, factorial2.isZeroOrOne(0));
        Assert.assertEquals(true, factorial2.isZeroOrOne(1));
        Assert.assertEquals(false, factorial2.isZeroOrOne(5));
    }
}