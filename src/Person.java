import java.util.regex.*;
import java.util.*;
<<<<<<< HEAD

public class Person {
    private String name;
=======
public class Person {
    private String name;
    private int age;
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
    private String email;
    private String phoneNumber;
    private BirthDate birthDate;

<<<<<<< HEAD
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
=======
    Person() {
    }

    public Person(String name, int age, String email, BirthDate obj) {
        setName(name);
        setAge(age);
        setEmail(email);
        birthDate.setDay(obj.getDay());
        birthDate.setMonth(obj.getMonth());
        birthDate.setYear(obj.getYear());
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
<<<<<<< HEAD
            System.out.println("Your name has been added");
        } else {
            System.err.println("Invalid Name");
=======
            System.out.println("your name has been added");
            System.out.println();
        } else {
            System.err.println("Invalid Name");
            System.out.println();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            this.age = age;
            System.out.println("Your age has been added");
            System.out.println();
        } else {
            System.err.println("Invalid Age");
            System.out.println();
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (checkEmail(email)) {
            this.email = email;
<<<<<<< HEAD
            System.out.println("Your email has been added");
        } else {
            System.err.println("Invalid Email");
=======
            System.out.println("your email has been added");
            System.out.println();
        } else {
            System.err.println("Invalid Email");
            System.out.println();
        }
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int day, int month, int year) {
        BirthDate obj = new BirthDate(day, month, year);
        if (obj.validDate() && (2023 - this.age == obj.getYear())) {
            this.birthDate = obj;
            System.out.println("your Birth date has been added");
            System.out.println();
        } else {
            System.err.println("Invalid Birth date");
            System.out.println();
        }
    }

    public void setBirthDate(String s) {
        BirthDate obj = new BirthDate(s);
        if (obj.validDate() && (2023 - this.age == obj.getYear())) {
            this.birthDate = obj;
            System.out.println("your Birth date has been added");
            System.out.println();
        } else {
            System.err.println("Invalid Birth date");
            System.out.println();
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (checkPhone(phoneNumber)) {
            this.phoneNumber = phoneNumber;
<<<<<<< HEAD
            System.out.println("Your phone number has been added");
        } else {
            System.err.println("Invalid Phone Number");
=======
            System.out.println("your Phone number has been added");
            System.out.println();
        } else {
            System.err.println("Invalid Phone number");
            System.out.println();
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
        }
    }

    public boolean checkName(String name) {
<<<<<<< HEAD
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
=======

        String validName = "^[A-Za-z]+$";  // Regex

        if (name.length() == 0 || name.length() > 20) {
            return false;
        }

        Pattern pattern = Pattern.compile(validName);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean checkPhone(String Number) {
        String validNum = "^(012|010|011)\\d{8}$"; // Regex
        Pattern pattern = Pattern.compile(validNum);
        Matcher matcher = pattern.matcher(Number);
        return matcher.matches();

    }

    public boolean checkEmail(String Email) {
        String validEmail = "^[a-zA-Z0-9]+@(gmail|outlook|Yahoo)\\.(com|net)$"; // Regex
        Pattern pattern = Pattern.compile(validEmail, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

    public boolean checkAge(int age) {
        return age >= 20 && age <= 40;
    }

    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Phone Number : " + getPhoneNumber());
        System.out.println("Email : " + getEmail());
        getBirthDate().printDate();
        System.out.println();
    }
}
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
