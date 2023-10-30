<<<<<<< HEAD
=======
import java.util.regex.*;
import java.util.*;
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
public class BirthDate {
    private int day;
    private int month;
    private int year;
<<<<<<< HEAD

    public BirthDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public BirthDate() {}

    public BirthDate(String s) {
        if (validDate(s)) {
            String[] main = s.split("/");
            String day = main[1];
            String month = main[0];
            String year = main[2];
            this.day = Integer.parseInt(day);
            this.month = Integer.parseInt(month);
            this.year = Integer.parseInt(year);
        }
    }

=======
    BirthDate(){}
    public BirthDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setDay(year);
    }
    public BirthDate(String s) {
        String [] arr = s.split("/");
        setDay(Integer.parseInt(arr[0]));
        setDay(Integer.parseInt(arr[1]));
        setDay(Integer.parseInt(arr[2]));
    }
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
<<<<<<< HEAD
        if (checkDay(day)) {
            this.day = day;
        } else {
            System.err.println("Invalid Birth Day");
=======
        if (checkDay(day))  {
            this.day=day;
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
<<<<<<< HEAD
        if (checkMonth(month)) {
            this.month = month;
        } else {
            System.err.println("Invalid Birth Month");
=======
        if (checkMonth(month))  {
            this.month=month;
        }
        else    {
            System.err.println("Invalid Birth date");
            System.out.println();
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
<<<<<<< HEAD
        if (checkYear(year)) {
            this.year = year;
        } else {
            System.err.println("Invalid Birth Year");
        }
    }

    public boolean checkDay(int day) {
        return day >= 1 && day <= 31;
    }

    public boolean checkMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public boolean checkYear(int year) {
        return year <= 2003 && year >= 1983;
    }

    public boolean validDate(String date) {
        if (date.matches("(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])/\\d{4}")) {
            String[] main = date.split("/");
            String day = main[1];
            String month = main[0];
            String year = main[2];
            return checkDay(Integer.parseInt(day)) && checkMonth(Integer.parseInt(month)) && checkYear(Integer.parseInt(year));
        }
        return false;
    }

    public void printDate() {
        System.out.println("Birth Date: " + this.getMonth() + "/" + this.getDay() + "/" + this.getYear());
=======
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
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
    }
}
