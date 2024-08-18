package materials.src.main.java.org.example.course.Model10.entities;

public class PeopleHeightMeter {
    private String gender;
    private double height;

    public PeopleHeightMeter(String gender, double height){
        this.gender = gender;
        this.height = height;
    }

    public String getGender(){
        return gender;
    }

    public double getHeight(){
        return height;
    }
}
