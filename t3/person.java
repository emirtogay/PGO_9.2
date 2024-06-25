package t3;
import java.time.Year;


public abstract class person {
    private String firstName;
    private String lastName;
    private int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getBirthdayYear() {
        return birthdayYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthdayYear;
    }
}
}
