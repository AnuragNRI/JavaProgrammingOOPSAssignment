import java.util.Scanner;

public class Customer implements Validation {
    // These are the Attributes of a Single Customer
    Scanner sc = new Scanner(System.in);
    String name;
    String userName;
    String password;
    int age;
    String ssn;
    String address;
    String email;
    long phone;
    float balance = 0;

    public void showDetails() {
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
        System.out.println("Address = " + this.address);
        System.out.println("Email = " + this.email);
        System.out.println("phone = " + this.phone);

    }

    public Boolean profile() {
        System.out.println("Enter Your Details");
        System.out.println("Enter your name");
        String nameInput = sc.nextLine();
        this.name = nameInput;

        System.out.println("Enter your age");
        int ageInput = Integer.parseInt(sc.nextLine()); // If age is > 18 then move forward else start the app again
        this.age = ageInput;
        if (!this.validateAge()) {
            return false;
        }

        System.out.println("Enter you ssn ");
        String ssnInput = sc.nextLine();
        this.ssn = ssnInput;
        if (!this.validateSSN()) { // Checking the ssn If it is Ok then we will move frward else start the app
                                   // again
            return false;
        }

        System.out.println("Enter you address ");
        String addressInput = sc.nextLine();
        this.address = addressInput;

        System.out.println("Enter you email ");
        String emailInput = sc.nextLine();
        this.email = emailInput;

        System.out.println("Enter you phone number ");
        long phoneInput = sc.nextLong();
        sc.nextLine();
        this.phone = phoneInput;

        System.out.println("Account Created Succesfully");
        return true;
    }

    public Boolean validateSSN() {
        if (this.ssn.length() < 9) {
            System.out.println("Invalid SSN Number");
            return false;
        }
        return true;
    }

    public Boolean validateAge() {
        if (this.age < 18) {
            System.out.println("You are not eligible to open a bank account");
            return false;
        }
        return true;
    }

    // This is the menubar that we can show to any customer that what are the
    // possible option that he can do in his account
    public void menuBar() {
        System.out.println("\n");
        System.out.println("Please select the option");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawl");
        System.out.println("3. CheckBalance");
        System.out.println("4. Edit Profile");
        System.out.println("5. Change Password");
        System.out.println("6 . Show Details");
        System.out.println("7. Exit");
    }

    /*
     * This is the main algorithm where he can actually achieve the functionality of
     * different options he has
     * When we want to continue after any method execution completes that if we want
     * to continue then it will again ask for the input
     * and again check all the conditions
     * And if not then it will throw us into the login page , This is a program for
     * single user
     * so consider that the data of old user is lost and when we login again it will
     * reset the data
     * of the same old user and kind of create a new user
     */

    public void BankAlgorithm() {

        String s;
        outer_loop: while (true) {

            System.out.println("\n");
            System.out.println("Enter Your Choice");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {

                case 1:
                    System.out.println("\n");
                    System.out.println("Enter the Amount (How much amount you want to deposit)");
                    float n = Integer.parseInt(sc.nextLine());
                    this.deposit(n);

                    System.out.println("Do you want to continue");
                    s = sc.nextLine();
                    if (s.equals("yes")) {
                        this.menuBar();
                        break;
                    } else {
                        this.login();
                        break outer_loop;
                    }

                case 2:
                    System.out.println("\n");
                    System.out.println("Enter the amount you want to withdraw");
                    float m = Integer.parseInt(sc.nextLine());
                    this.withDrawal(m);

                    System.out.println("Do you want to continue");
                    s = sc.nextLine();
                    if (s.equals("yes")) {
                        this.menuBar();
                        break;
                    } else {
                        this.login();
                        break outer_loop;
                    }

                case 3:
                    this.checkBalance();

                    System.out.println("Do you want to continue");
                    s = sc.nextLine();
                    if (s.equals("yes")) {
                        this.menuBar();
                        break;
                    } else {
                        this.login();
                        break outer_loop;
                    }

                case 4:
                    this.editProfile();

                    System.out.println("Do you want to continue");
                    s = sc.nextLine();
                    if (s.equals("yes")) {
                        this.menuBar();
                        break;
                    } else {
                        this.login();
                        break outer_loop;
                    }
                case 5:

                    this.changePassword();

                    System.out.println("Do you want to continue"); //
                    s = sc.nextLine();
                    if (s.equals("yes")) {
                        this.menuBar();
                        break;
                    } else {
                        this.login();
                        break outer_loop;
                    }
                case 6:
                    this.showDetails();

                    System.out.println("Do you want to continue"); //
                    s = sc.nextLine();
                    if (s.equals("yes")) {
                        this.menuBar();
                        break;
                    } else {
                        this.login();
                        break outer_loop;
                    }
                case 7:
                    break outer_loop;
            }

        }

    }

    public void login() {
        // Start of the Login Page
        System.out.println("\n");
        System.out.println("********** Welcome to ABC Bank Limited **********");

        System.out.println("Enter Username");
        String user = sc.nextLine();
        System.out.println("Enter Password");
        String pass = sc.nextLine();

        this.userName = user;
        this.password = pass;

        if (!this.profile()) {
            this.login();
            this.balance = 0;
        }

        else {
            this.menuBar();
            this.BankAlgorithm();
        }

    }

    public void deposit(Float n) {
        this.balance += n;
        System.out.println("Deposited Success");

    }

    public void withDrawal(Float m) {
        this.balance -= m;
        System.out.println("Withdrawal Success");

    }

    public void checkBalance() {
        System.out.println("\n");
        System.out.println("Your balance is " + this.balance);

    }

    public void editProfile() {

        System.out.println("Enter your name");
        String nameInput = sc.nextLine();
        this.name = nameInput;

        System.out.println("Enter you address ");
        String addressInput = sc.nextLine();
        this.address = addressInput;

        System.out.println("Enter you email ");
        String emailInput = sc.nextLine();
        this.email = emailInput;

        System.out.println("Enter you phone number ");
        long phoneInput = Integer.parseInt(sc.nextLine());
        this.phone = phoneInput;

        System.out.println("Information Updated Successfully");

    }

    public void changePassword() {

        System.out.println("Enter the old password");
        String oldpass = sc.nextLine();

        if (this.password.equals(oldpass)) {
            System.out.println("Enter the new password");
            String newPass = sc.nextLine();
            this.password = newPass;
            System.out.println("Password Changed Successfully");

        } else {
            System.out.println("Password was incorrect");

        }

    }
}
