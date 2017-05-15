/*
    Test class
 */
package phonenumberdatabasepractice;

import java.util.Scanner;

/**
 *
 * @author Hien Long
 */
public class PhoneNumberDatabasePractice_Test {

    /*
    Declare final String for database connection
     */
    static final String JDBC_DRIVER = "com.mysqlmjdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMPLOYEES";
    static final String USER = "username";
    static final String PASS = "password";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhoneNumberDatabasePractice databasePractice = new PhoneNumberDatabasePractice(JDBC_DRIVER, DB_URL, USER, PASS);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Search by name\n"
                + "2. Search by mobile number\n"
                + "3. Exit\n"
                + "Enter your option 1, 2, 3");
        String input;
        input = keyboard.nextLine();
        switch (input) {
            case "1":
                System.out.println("Please enter a name to search: ");
                input = keyboard.nextLine();
                databasePractice.getPhone(input);
            case "2":
                System.out.println("Please enter a phone number to search: ");
                input = keyboard.nextLine();
                databasePractice.getName(input);
            case "3":
                System.exit(0);
        }
    }

}
