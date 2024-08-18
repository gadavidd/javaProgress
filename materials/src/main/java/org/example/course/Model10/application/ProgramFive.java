package materials.src.main.java.org.example.course.Model10.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramFive {//List
    public static void main(String [] args){
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for(String x: list){
            System.out.println(x);
        }

        System.out.println("---------------------------------------");
//        list.remove("Anna");
//        list.remove(1); //Remove Alex
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x: list){
            System.out.println(x);
        }

        System.out.println("---------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("---------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x: result){
            System.out.println(x);
        }

        System.out.println("---------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("---------------------------------------");
        String nameNull = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nameNull);


    }
}
