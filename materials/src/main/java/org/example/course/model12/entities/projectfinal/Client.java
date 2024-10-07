package materials.src.main.java.org.example.course.model12.entities.projectfinal;

import java.util.Calendar;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public Client(){
    }

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getStringBirthDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthDate);

        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH) + 1;
        int dayBirth = calendar.get(Calendar.DATE);

        String date = dayBirth + "/" + monthBirth + "/" + yearBirth;
        return date;
    }


    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
