package Day___17;
/*
 Checked Exception 

 These are exceptions that are checked at compile-time.
 The programmer must handle these exceptions explicitly using try-catch blocks 
 or declare them in the method signature using throws.

 IOException: thrown when an I/O operation fails.
 SQLException: thrown when a database operation fails.
 FileNotFoundException: thrown when a file is not found.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class p13 {

    public static void main(String[] args) {
        // IOException 
        try {
            File file = new File("Unified.png");
            FileInputStream stream = new FileInputStream(file);
            stream.close();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }

        // SQLException 
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Caught a SQLException: " + e.getMessage());
        }

        // FileNotFoundException
        try {
            File file2 = new File("nonexistentfile.txt");
            FileInputStream stream2 = new FileInputStream(file2);
            stream2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Caught a FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught an IOException while closing the file: " + e.getMessage());
        }
    }
}
