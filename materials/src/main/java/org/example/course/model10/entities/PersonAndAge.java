package materials.src.main.java.org.example.course.model10.entities;

public class PersonAndAge {
    private String name;
    private int age;

    public PersonAndAge(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
