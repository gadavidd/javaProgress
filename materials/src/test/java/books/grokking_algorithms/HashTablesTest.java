package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.HashTables;
import org.junit.Test;

public class HashTablesTest {

    @Test
    public void hastTablesTest1(){
        HashTables ht = new HashTables();

        ht.addBook("apple", 0.67);  // an apple costs 67 cents
        ht.addBook("milk", 1.49);  // milk costs $1.49
        ht.addBook("avocado", 1.49);  // milk costs $1.49

        System.out.println(ht.getBook());   // {apple=0.67, avocado=1.49, milk=1.49}
    }

    @Test
    public void hashTablesTest2(){
        HashTables ht1 = new HashTables();

        System.out.println(ht1.checkVoter("tom")); // let them vote!
        System.out.println(ht1.checkVoter("mike")); // let them vote!
        System.out.println(ht1.checkVoter("mike")); // kick them out!
    }
}
