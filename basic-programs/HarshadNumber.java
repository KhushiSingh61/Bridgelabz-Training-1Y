import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n;
		n = sc.nextInt();

        int originalNumber = n;
        int sum = 0;                 
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}