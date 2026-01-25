import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year;
		year= sc.nextInt();
        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println("Year is NOT a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } 
            else {
                System.out.println("Year is NOT a Leap Year");
            }
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Part 2: Year is a Leap Year");
            } else {
                System.out.println("Part 2: Year is NOT a Leap Year");
            }
        } else {
            System.out.println("Leap Year calculation is valid only for year 1582 or later.");
        }
    }
}