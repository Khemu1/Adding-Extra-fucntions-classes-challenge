import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Person> data = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            if (data.isEmpty()) {
                System.out.println("To enter your data, Enter 1");
            }
            System.out.println("To re-enter your data, Enter 2");
            System.out.println("To print your info, Enter 3");
            System.out.println("To exit, Enter 0");

            String choice = in.next();

            switch (choice) {
                case "1"-> {
                    System.out.println("Please enter your data as follows: Name, Age, Phone number, Email, and Birth date");
                    System.out.println("We only deal with Google, Outlook, and Yahoo emails.");
                    System.err.println("Your birth date should be in this form `21/04/2004`");

                    Person obj = new Person();
                    BirthDate birth = new BirthDate();

                    // Gather user input, validate, and handle invalid input
                    boolean validInput = false;
                    while (!validInput) {
                        String name = in.next();
                        if (obj.checkName(name)) {
                            obj.setName(name);
                        } else {
                            System.err.println("Invalid Name. Please try again.");
                            continue; // Ask for input again
                        }

                        int age = in.nextInt();
                        if (obj.checkAge(age)) {
                            obj.setAge(age);
                        } else {
                            System.err.println("Invalid age. Please try again.");
                            continue;
                        }

                        String phone = in.next();
                        if (obj.checkPhone(phone)) {
                            obj.setPhoneNumber(phone);
                        } else {
                            System.err.println("Invalid Phone number. Please try again.");
                            continue;
                        }

                        String email = in.next();
                        if (obj.checkEmail(email)) {
                            obj.setEmail(email);
                        } else {
                            System.err.println("Invalid email. Please try again.");
                            continue;
                        }

                        String date = in.next();
                        if (birth.validDate(date)) {
                            obj.setBirthDate(date);
                        } else {
                            System.err.println("Invalid birth date. Please try again.");
                            continue;
                        }

                        validInput = true;
                    }

                    data.add(obj);
                    System.out.println("Your data has been added.");
                }

                case "2" -> {
                    if (data.isEmpty()) {
                        System.err.println("You didn't enter any data to re-enter.");
                    } else {
                        System.out.println("Please re-enter you data");
                        Person obj = new Person();
                        BirthDate birth = new BirthDate();

                        boolean validInput = false;
                        while (!validInput) {
                            String name = in.next();
                            if (obj.checkName(name)) {
                                obj.setName(name);
                            } else {
                                System.err.println("Invalid Name. Please try again.");
                                continue;
                            }

                            int age = in.nextInt();
                            if (obj.checkAge(age)) {
                                obj.setAge(age);
                            } else {
                                System.err.println("Invalid age. Please try again.");
                                continue;
                            }

                            String phone = in.next();
                            if (obj.checkPhone(phone)) {
                                obj.setPhoneNumber(phone);
                            } else {
                                System.err.println("Invalid Phone number. Please try again.");
                                continue;
                            }

                            String email = in.next();
                            if (obj.checkEmail(email)) {
                                obj.setEmail(email);
                            } else {
                                System.err.println("Invalid email. Please try again.");
                                continue;
                            }

                            String date = in.next();
                            if (birth.validDate(date)) {
                                obj.setBirthDate(date);
                            } else {
                                System.err.println("Invalid birth date. Please try again.");
                                continue;
                            }

                            validInput = true;
                        }

                        data.add(obj);
                        System.out.println("Your data has been added.");
                    }
                }

                case "3"-> {
                    if (!data.isEmpty()) {
                        data.get(0).printInfo();
                    } else {
                        System.err.println("No data to print.");
                    }
                }

                case "0"-> {
                    exit = true;
                }
                default -> {
                    System.err.println("Enter a valid number (0-3).");

                }
            }
        }
    }
}
