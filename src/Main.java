import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Person> data = new ArrayList<>();
        boolean exit = false;
<<<<<<< HEAD
=======

>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
        while (!exit) {
            if (data.isEmpty()) {
                System.out.println("To enter your data, Enter 1");
            }
            System.out.println("To re-enter your data, Enter 2");
            System.out.println("To print your info, Enter 3");
            System.out.println("To exit, Enter 0");

            String choice = in.next();

            switch (choice) {
<<<<<<< HEAD
                case "1" -> {
                    System.out.println("Please enter your data as follows: Name, Phone number, Email, and Birth date");
                    System.out.println("We only deal with Google, Outlook, and Yahoo emails.");
                    System.err.println("Your birth date should be in this form `04/21/2004`");

                    Person obj = new Person();
                    BirthDate birth = new BirthDate();
=======
                case "1"-> {
                    System.out.println("Please enter your data as follows: Name, Age, Phone number, Email, and Birth date");
                    System.out.println("We only deal with Google, Outlook, and Yahoo emails.");
                    System.err.println("Your birth date should be in this form `21/04/2004`");

                    Person obj = new Person();
                    BirthDate birth = new BirthDate();

>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
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
<<<<<<< HEAD
=======

                        int age = in.nextInt();
                        if (obj.checkAge(age)) {
                            obj.setAge(age);
                        } else {
                            System.err.println("Invalid age. Please try again.");
                            continue;
                        }

>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
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
<<<<<<< HEAD
                        if (new BirthDate().validDate(date)) {
                            obj.setBirthDate(new BirthDate(date));
=======
                        if (birth.validDate(date)) {
                            obj.setBirthDate(date);
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
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
<<<<<<< HEAD
                        System.out.println("Please re-enter your data");
=======
                        System.out.println("Please re-enter you data");
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
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
<<<<<<< HEAD
=======

                            int age = in.nextInt();
                            if (obj.checkAge(age)) {
                                obj.setAge(age);
                            } else {
                                System.err.println("Invalid age. Please try again.");
                                continue;
                            }

>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
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
<<<<<<< HEAD
                            if (new BirthDate().validDate(date)) {
                                obj.setBirthDate(new BirthDate(date));
=======
                            if (birth.validDate(date)) {
                                obj.setBirthDate(date);
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
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

<<<<<<< HEAD
                case "3" -> {
=======
                case "3"-> {
>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
                    if (!data.isEmpty()) {
                        data.get(0).printInfo();
                    } else {
                        System.err.println("No data to print.");
                    }
                }

<<<<<<< HEAD
                case "0" -> {
                    exit = true;
                }

                default -> {
                    System.err.println("Enter a valid number (0-3).");
=======
                case "0"-> {
                    exit = true;
                }
                default -> {
                    System.err.println("Enter a valid number (0-3).");

>>>>>>> b4c5889bbf5680fad00d467544a6e62085a387ea
                }
            }
        }
    }
}
