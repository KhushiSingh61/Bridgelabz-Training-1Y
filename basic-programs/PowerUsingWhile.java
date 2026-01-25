import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n;
		n= sc.nextInt();
        System.out.print("Enter the power: ");
        int power;
		power= sc.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result = result * n;
            counter++;
        }
        System.out.println("Result = " + result);
    }
}