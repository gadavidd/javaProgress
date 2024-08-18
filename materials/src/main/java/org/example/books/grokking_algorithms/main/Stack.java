package materials.src.main.java.org.example.books.grokking_algorithms.main;

public class Stack {

    public void greet(String name) {
        System.out.println("hello, " + name + "!");
        System.out.println(greet2(name));
        System.out.println("getting ready to say bye...");
        System.out.println(bye());
    }
    public String greet2(String name) {
        return ("how are you, " + name + "?");
    }

    public String bye() {
        return ("ok bye!");
    }

}
