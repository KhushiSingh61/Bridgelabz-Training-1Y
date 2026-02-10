import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int findLength(String str) {
        int count = 0;

        for (int i = 0; ; i++) {
            if (str.charAt(i) == '\0') {
                break;
            }
            count++;
            if (str.substring(0, i + 1).equals(str)) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int builtinLength = input.length();

        System.out.println("Length (without using length method): " + customLength);
        System.out.println("Length (using built-in length method): " + builtinLength);
    }
}
