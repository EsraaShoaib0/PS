import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args)    {
        //====================Project===============================
        ExpirableProduct cheese = new ExpirableProduct("Cheese", 5.0, 10, LocalDate.now().plusDays(5));
        ExpirableProduct biscuits = new ExpirableProduct("Biscuits", 2.0, 20, LocalDate.now().minusDays(20));
        ShippableProduct tv = new ShippableProduct("TV", 500.0, 2, 10);
        Product mobileCard = new Product("Mobile Scratch Card", 10.0, 100) {};

        Customer customer = new Customer("Esraa", 600);

//        customer.addToCart(cheese, 2);
//        customer.addToCart(tv, 1);
        //customer.addToCart(mobileCard, 1);
        //customer.addToCart(biscuits, 1);

        customer.checkout();
//=============================Exception=================================
//        System.out.println("=== Checked Exceptions ===");
//        // Checked Exception Example - FileNotFoundException
//
//        try {
//            FileInputStream file = new FileInputStream("test.txt"); // File may not exist
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//        System.out.println("File opened successfully!");
////        } catch (FileNotFoundException e) {
////            System.out.println("File not found: " + e.getMessage());
////        }
//
//        // Checked Exception Example - SQLException
//        try {
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/test", "root", "password"
//            );
//            System.out.println("Database connected successfully!");
//        } catch (SQLException e) {
//            System.out.println("Database connection error: " + e.getMessage());
//        }
//
//        System.out.println("\n=== Unchecked Exceptions ===");
//        // Unchecked Exception Example - NullPointerException
//        try {
//            String name = null;
//            System.out.println(name.length()); // This will throw NullPointerException
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException caught: " + e.getMessage());
//        }
//
//       //  Unchecked Exception Example - ArithmeticException
//        try {
//            int result = 10 / 0; // Division by zero
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught: " + e.getMessage());
//        }
//
//        // Unchecked Exception Example - ArrayIndexOutOfBoundsException
//        try {
//            int[] numbers = {1, 2, 3};
//            System.out.println(numbers[5]); // Invalid index
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//        }
//
//        System.out.println("\nProgram continues after handling exceptions!");
        //========================================Collections=====================================
        // List example
//        List<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Charlie");
//        System.out.println("List: " + names);
//
//        // Set example
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(10); // duplicate, won't be added
//        System.out.println("Set: " + numbers);
//
//        // Map example
//        Map<String, Integer> ages = new HashMap<>();
//        ages.put("Alice", 25);
//        ages.put("Bob", 30);
//        System.out.println("Map: " + ages);
//
    }
}
