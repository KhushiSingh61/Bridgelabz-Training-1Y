import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        // start index greater than end index
        String sub = text.substring(5, 2);   // This will cause runtime exception
        System.out.println(sub);
    }

    // Method to HANDLE it safely without try-catch
    public static void handleException(String text) {

        int start = 5;
        int end = 2;

        // Preventing exception using condition
        if (start > end) {
            System.out.println("Invalid indexes: start index is greater than end index.");
        } else {
            String sub = text.substring(start, end);
            System.out.println("Substring: " + sub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // First: this will generate runtime exception and stop program
        generateException(text);

        // Refactored safe method (will run only if above line is removed/commented)
        handleException(text);

        sc.close();
    }
}
