package materials.src.main.java.org.example.course.Model10.entities;

public class StudentGrades {
    private String name;
    private double gradeOne, gradeTwo;
    private double finalGrade;

    public StudentGrades(String name, double gradeOne, double gradeTwo) {
        this.name = name;
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
        this.finalGrade = (gradeOne+gradeTwo)/2;
    }

    public String getName() {
        return name;
    }

    public double getFinalGrade() {
        return finalGrade;
    }
}
