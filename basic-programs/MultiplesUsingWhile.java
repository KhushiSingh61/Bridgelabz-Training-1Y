import java.util.Scanner;

public class MultiplesUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int n = sc.nextInt();
        if (n > 0 && n < 100) {
            int counter = n - 1;
            System.out.println("Number that perfectly divide " + n + ":");
            while (counter > 1) {
                if (n % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Not Positive");
        }
    }
}









