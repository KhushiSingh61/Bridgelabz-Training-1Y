import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        char ch = text.charAt(text.length());
        System.out.println(ch);
    }
    public static void handleException(String text) {
        try {
            char ch = text.charAt(text.length());
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: Index is out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException() method.");
        }
        handleException(text);
    }
}
