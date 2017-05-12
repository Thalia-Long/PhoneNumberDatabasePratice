/*  DAY 11
Write a java program that loads names and phone numbers from a database table 
where It takes a name or phone number as input and prints the corresponding other
value from the database table. (Hint: use hash tables to load the data from the database table).
================================================================================
Sample Output:

Table with name and mobile number,
When you run the code, there should be a menu
1. Search by name
2. Search by mobile number
3. Exit
Enter your option 1, 2, 3   [if you enter 1]
Enter the name,
XXXX [search the data, which is already loaded into hashtable and return a message
that its available or not]
Enter option 1, 2, 3 [ if you enter 2]
Enter the mobile number
9999[search the data, which is already loaded into hashtable and return a message]
================================================================================

Write a java program that takes tab separated data (one record per line) from a 
text file and inserts them into database
 */
package phonenumberdatabasepractice;

import java.sql.Connection;

/**
 *
 * @author Hien Long
 */
public class PhoneNumberDatabasePractice {
    /*
    class field declarations
    */
    private Connection connection;
    /*
    Constructor who takes the String needed to connect to a database
    */
    public PhoneNumberDatabasePractice( ){
        
    }
    
    /*
    Connect to a database
    */
    
    public Connection getConnection(){
        return connection;
    }
    
    /*
    Get name corresponed to the phone number input
    */
    public String getName(){
        String name = null;
        return name;
    }
    
    /*
    Get phone number corresponded to the name input
    */
    public String getPhone(){
        String phone = null;
        return phone;
    }
    
    
    
}
