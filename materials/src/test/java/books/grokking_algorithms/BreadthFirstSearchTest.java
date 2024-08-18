package materials.src.test.java.books.grokking_algorithms;

import materials.src.main.java.org.example.books.grokking_algorithms.main.BreadthFirstSearch;
import org.junit.Test;

import java.util.Arrays;

public class BreadthFirstSearchTest {

    BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

    @Test
    public void testSearchYou() {
        breadthFirstSearch.put("you", Arrays.asList("alice", "bob", "claire"));
        breadthFirstSearch.put("bob", Arrays.asList("anuj", "peggy"));
        breadthFirstSearch.put("alice", Arrays.asList("peggy"));
        breadthFirstSearch.put("claire", Arrays.asList("thom", "jonny"));
        breadthFirstSearch.put("anuj");
        breadthFirstSearch.put("peggy");
        breadthFirstSearch.put("thom");
        breadthFirstSearch.put("jonny");

        breadthFirstSearch.search("you");
    }

}

