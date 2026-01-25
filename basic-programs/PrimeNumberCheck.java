import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n;
		n = sc.nextInt();
        if (n > 1) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The number is a Prime Number");
            } else {
                System.out.println("The number is NOT a Prime Number");
            }
        } else {
            System.out.println("Prime numbers are greater than 1");
        }
    }
}