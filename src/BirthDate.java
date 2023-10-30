public class BirthDate {
    private int day;
    private int month;
    private int year;

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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (checkDay(day)) {
            this.day = day;
        } else {
            System.err.println("Invalid Birth Day");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (checkMonth(month)) {
            this.month = month;
        } else {
            System.err.println("Invalid Birth Month");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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
        System.out.println("Birth Date: " + (this.getMonth() < 10 ? "0"+this.getMonth():this.getMonth() )+ "/" + (this.getDay() < 10 ? "0"+this.getDay():this.getDay() )+ "/" + this.getYear());
    }
}
