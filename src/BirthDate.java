import java.util.regex.*;
import java.util.*;
public class BirthDate {
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
