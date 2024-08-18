package materials.src.main.java.org.example.books.grokking_algorithms.main;

import java.util.HashMap;
import java.util.Map;
public class HashTables {

    private Map<String, Double> book = new HashMap<>();
    private Map<String, Boolean> voted = new HashMap<>();
    public void addBook(String product, double price) {
        book.put(product,price);
    }
    public String checkVoter(String name) {
        if (voted.containsKey(name)) {
            return "kick them out!";
        } else {
            voted.put(name, true);
            return "let them vote!";
        }
    }

    public Map<String, Double> getBook(){
        return book;// {apple=0.67, avocado=1.49, milk=1.49}
    }
}
