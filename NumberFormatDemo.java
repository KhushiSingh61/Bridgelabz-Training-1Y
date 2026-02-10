import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }
    public static void handleException(String text) {

        boolean isNumber = true;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                isNumber = false;
                break;
            }
        }

        if (isNumber) {
            int num = Integer.parseInt(text);
            System.out.println("Converted Number: " + num);
        } else {
            System.out.println("Invalid input! Cannot convert to number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.next();
        generateException(text);
        handleException(text);
    }
}
