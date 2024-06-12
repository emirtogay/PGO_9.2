package t3;
import java.time.LocalDate;

public class Manager extends Employee{
    double bonus;

    public Manager(String firstName, String lastName, int birthYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }
    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }

    public String toString(){
        System.out.println("Managers last name:" + lastName + "age: " getAge() + " salary" + getSalary());
        return null;
    }
}
