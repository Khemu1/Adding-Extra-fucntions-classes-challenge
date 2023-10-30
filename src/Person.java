import java.util.regex.*;
import java.util.*;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;
    private BirthDate birthDate;

    public Person(String name, String email, String phoneNumber, String date) {
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        this.birthDate = new BirthDate(date);
    }
    public Person(){}

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
            System.out.println("Your name has been added");
        } else {
            System.err.println("Invalid Name");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (checkEmail(email)) {
            this.email = email;
            System.out.println("Your email has been added");
        } else {
            System.err.println("Invalid Email");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (checkPhone(phoneNumber)) {
            this.phoneNumber = phoneNumber;
            System.out.println("Your phone number has been added");
        } else {
            System.err.println("Invalid Phone Number");
        }
    }

    public boolean checkName(String name) {
        String validName = "^[A-Za-z]+$"; // Regex
        return name.length() > 0 && name.length() <= 20 && name.matches(validName);
    }

    public boolean checkPhone(String phoneNumber) {
        String validNum = "^(012|010|011)\\d{8}$"; // Regex
        return phoneNumber.matches(validNum);
    }

    public boolean checkEmail(String email) {
        String validEmail = "^[a-zA-Z0-9]+@(gmail|outlook|Yahoo)\\.(com|net)$"; // Regex
        return email.matches(validEmail);
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        if (birthDate != null) {
            birthDate.printDate();
        }
        System.out.println();
    }
}