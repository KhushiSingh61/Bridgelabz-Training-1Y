import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n;
		n = sc.nextInt();
        int sum = 0;                     
        int originalNumber = n;      
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }
        if (sum == n) {
            System.out.println("The number is an Armstrong Number");
        } else {
            System.out.println("The number is NOT an Armstrong Number");
        }
    }
}