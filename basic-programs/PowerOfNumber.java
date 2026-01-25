import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n;
		n= sc.nextInt();
        System.out.print("Enter the power: ");
        int power;
		power = sc.nextInt();
        if (n > 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * n;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Please enter positive integers only.");
        }
    }
}