package materials.src.main.java.org.example.course.model12.entities.projectOne;

import materials.src.main.java.org.example.course.model12.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    //Association
    private Department department; //Has One
    private List<HourContract> contractsList = new ArrayList<>(); //Has many

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContractsList() {
        return contractsList;
    }

    public void addContract(HourContract contract){
        contractsList.add(contract);
    }

    public void remove(HourContract contract){
        contractsList.remove(contract);
    }

    public double income(int year, int month){
        double valueIncome = baseSalary;

        for(HourContract contract: contractsList){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(contract.getDate());

            int yearContract = calendar.get(Calendar.YEAR);
            int monthContract = calendar.get(Calendar.MONTH)+1;

            if(month == monthContract && year == yearContract){
                valueIncome += contract.totalValue();
            }
        }
        return valueIncome;
    }
}
