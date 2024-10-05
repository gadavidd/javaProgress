package materials.src.main.java.org.example.course.Model10.application;

public class ProgramThree {
    public static void main(String[] args){
        int x = 20;

        Object obj = x; //Boxing

        System.out.println(obj);

        int y = (int) obj; //Unboxing

        System.out.println(y);


        int x1 = 20;

        Integer objY = x1; //Boxing

        System.out.println(objY);

        int y1 = objY; //Unboxing

        System.out.println(y);
    }
}
