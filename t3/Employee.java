package t3;
import java.time.LocalDate;
import java.time.Period;
public class Employee extends person{
    int hireDate;
    String companyName;
    double salary;

    public Employee(String firstName, String lastName, int birthYear, int hireDate, String companyName, double salary){
        super(firstName, lastName, birthYear);
        this.companyName = companyName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getJobSeniority(){
        return 2024-hireDate;
    }
    public double getSalary(){
        return salary;
    }
}
