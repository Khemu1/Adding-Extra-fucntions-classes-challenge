import java.util.regex.*;
import java.util.*;
class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private BirthDate birthDate;

    Person(){}

    public Person(String name, int age, String email,BirthDate obj) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.birthDate=obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkName(name))    {
            this.name=name;
            System.out.println("your name has been added");
            System.out.println();
        }
        else {
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
        }
        else    {
            System.err.println("Invalid Age");
            System.out.println();
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (checkEmail(email))  {
            this.email=email;
            System.out.println("your email has been added");
            System.out.println();
        }
        else    {
            System.err.println("Invalid Email");
            System.out.println();
        }
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int day , int month , int year) {
        BirthDate obj = new BirthDate(day,month,year);
        if (obj.validDate() && (2023 - this.age == obj.getYear()))   {
            this.birthDate=obj;
            System.out.println("your Birth date has been added");
            System.out.println();
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
        }
    }
    public void setBirthDate(String s) {
        BirthDate obj = new BirthDate(s);
        if (obj.validDate() && (2023- this.age == obj.getYear() ))   {
            this.birthDate=obj;
            System.out.println("your Birth date has been added");
            System.out.println();
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
        }
    }

    public  String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)  {
        if (checkPhone(phoneNumber))    {
            this.phoneNumber=phoneNumber;
            System.out.println("your Phone number has been added");
            System.out.println();
        }
        else    {
            System.err.println("Invalid Phone number");
            System.out.println();
        }
    }
    public boolean checkName(String name)  {

        String validName= "^[A-Za-z]+$";  // Regex

        if (name.length()==0 || name.length()>20)   {
            return false;
        }

        Pattern pattern = Pattern.compile(validName);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public boolean checkPhone(String Number)  {
        String validNum= "^(012|010|011)\\d{8}$"; // Regex
        Pattern pattern= Pattern.compile(validNum);
        Matcher matcher= pattern.matcher(Number);
        return matcher.matches();

    }
    public boolean checkEmail(String Email)  {
        String validEmail= "^[a-zA-Z0-9]+@(gmail|outlook|Yahoo)\\.(com|net)$"; // Regex
        Pattern pattern= Pattern.compile(validEmail,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(Email);
        return matcher.matches();
    }
    public boolean checkAge(int age)    {
        return age>=20 && age<=40;
    }
    public  void printInfo()    {
        System.out.println("Name : " +getName());
        System.out.println("Age : " +getAge());
        System.out.println("Phone Number : " +getPhoneNumber());
        System.out.println("Email : "+ getEmail());
        getBirthDate().printDate();
        System.out.println();
    }

}

class BirthDate   {
    private int day;
    private int month;
    private int year;
    BirthDate(){}
    public BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public BirthDate(String s) {
        String [] arr = s.split("/");
        this.day=Integer.parseInt(arr[0]);
        this.month=Integer.parseInt(arr[1]);
        this.year=Integer.parseInt(arr[2]);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (checkDay(day))  {
            this.day=day;
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (checkMonth(month))  {
            this.month=month;
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (checkYear(year))  {
            this.year=year;
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
        }
    }
    public  boolean checkDay(int day)  {
        return day>=1 && day <=31 ;
    }
    public  boolean checkMonth(int month)  {
        return  month >=1 && month <=12;
    }
    public boolean checkYear(int year)  {
        return year <= 2003 && year >= 1983;
    }
    public boolean validDate()  {
        return checkDay(this.day) && checkMonth(this.month) && checkYear(this.year);
    }
    public  boolean validDate(String s)  {
        String [] arr= s.split("/");
        String validDate = "^(0[1-9]|[1-2][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$";
        Pattern pattern= Pattern.compile(validDate);
        Matcher matcher= pattern.matcher(s);
        if (!matcher.matches())  {
            return false;
        }
        return checkDay(Integer.parseInt(arr[0])) && checkMonth(Integer.parseInt(arr[1])) && checkYear(Integer.parseInt(arr[2]));
    }
    public boolean validDate(int day, int month , int year)  {
        return checkDay(day) && checkMonth(month) && checkYear(year);
    }
    public void printDate() {
        System.out.println("Birth Date : "+ getDay() +"/"+ getMonth()+"/"+getYear());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Person> data = new ArrayList<>();
        Person test = new Person();
        BirthDate test2 = new BirthDate();
        test.setAge(20);
        if (test2.validDate("21/04/2003"))  {
            test.setBirthDate("21/04/2003");
            System.out.println("oj");
        }
        else    {
            System.out.println("no");
        }
        boolean exit=false;
//
        while (!exit)    {
            if (data.size()==0) {
                System.out.println("To enter you data Enter 1");
            }
            System.out.println("To renter your data Enter 2");
            System.out.println("To print your info Enter 3");
            System.out.println("To exit Enter 0");
            String num =in.next();
            switch (String.valueOf(num))    {
                case "1"-> {
                    System.err.println("please Read the following :");
                    System.out.println("enter you data as follows : Name , Age, Phone number , Email , Birth date");
                    System.err.println("we only deal with google, outlook & yahoo");
                    System.err.println("Your birth date should be in this form `21/04/2004`");
                    System.out.println();
                    if (data.size() == 0) {
                        Person obj = new Person();
                        BirthDate birth = new BirthDate();
                        String name = in.next();
                        if (obj.checkName(name)) {
                            obj.setName(name);
                        } else {
                            System.err.println("Invalid Name");
                            System.out.println();
                            break;
                        }
                        int age = in.nextInt();
                        if (obj.checkAge(age)) {
                            obj.setAge(age);
                        } else {
                            System.err.println("Invalid age");
                            System.out.println();
                            break;
                        }
                        String Phone = in.next();
                        if (obj.checkPhone(Phone)) {
                            obj.setPhoneNumber(Phone);
                        } else {
                            System.err.println("Invalid Phone number");
                            System.out.println();
                            break;
                        }
                        String email = in.next();
                        if (obj.checkEmail(email)) {
                            obj.setEmail(email);
                        } else {
                            System.err.println("Invalid email");
                            System.out.println();
                            break;
                        }
                        String date = in.next();
                        if (birth.validDate(date)) {
                            obj.setBirthDate(date);
                        } else {

                            System.err.println("Invalid birth  date");
                            System.out.println();
                            break;
                        }
                        data.add(obj);
                        System.out.println("your data has been added");
                    }
                    else    {
                        System.err.println("Please choose the Reentering option ");
                    }
                }
                ////////

                case "2"->    {
                    System.err.println("please Read the following :");
                    System.out.println("enter you data as follows : Name , Age, Phone number , Email , Birth date");
                    System.err.println("we only deal with google, outlook & yahoo");
                    System.err.println("Your birth date should be in this form `21/04/2004`");
                    System.out.println();
                    if (data.size() !=0)    {
                        data.clear();
                        Person obj = new Person();
                        BirthDate birth = new BirthDate();
                        System.out.println("Renter your data as follows :");
                        String name =in.next();
                        if (obj.checkName(name))    {
                            obj.setName(name);
                        }
                        else    {
                            System.err.println("Invalid Name");
                            System.out.println();
                            break;
                        }
                        int age=in.nextInt();
                        if (obj.checkAge(age))    {
                            obj.setAge(age);
                        }
                        else    {
                            data.clear();
                            System.err.println("Invalid age");
                            System.out.println();
                            break;
                        }
                        String Phone= in.next();
                        if (obj.checkPhone(Phone))    {
                            obj.setPhoneNumber(Phone);
                        }
                        else    {

                            System.err.println("Invalid Phone number");
                            System.out.println();
                            break;
                        }
                        System.out.println();
                        String email =in.next();
                        if (obj.checkEmail(email))    {
                            obj.setEmail(email);
                        }
                        else    {

                            System.err.println("Invalid email");
                            System.out.println();
                            break;
                        }
                        String date =in.next();
                        if (birth.validDate(date))    {
                            obj.setBirthDate(date);
                        }
                        else    {
                            System.err.println("Invalid birth date");
                            System.out.println();
                            break;
                        }
                            data.add(obj);
                            System.out.println("your data has been added");
                            System.out.println();
                    }
                    else    {
                        System.err.println("You didn't enter any data to renter anything");
                        System.out.println();
                    }

                }
                case "3"->    {
                    if (data.size()!=0) {
                        data.get(0).printInfo();
                    }
                    else {
                        System.err.println("No data to print");
                        System.out.println();
                    }
                }
                case "0"-> exit=true;

                default -> {
                    System.err.println("Enter a number between 1-4");
                    System.out.println();
                }
            }
        }
    }
}