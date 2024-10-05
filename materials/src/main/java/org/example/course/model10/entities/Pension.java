package materials.src.main.java.org.example.course.Model10.entities;

public class Pension {
    private int[] room = new int[10];
    private String[] names;
    private String[] emails;

    public Pension(int [] room, String[] names, String[] emails){
        this.room = room;
        this.names = names;
        this.emails = emails;
    }

    public void getRents(){
        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++){
            if(names[i] != null){
               System.out.println(i + " : " + names[i] + ", " + emails[i]);
            }
        }
    }

    public String[] getName(){
        return names;
    }

    public String[] getEmail(){
        return emails;
    }
}
