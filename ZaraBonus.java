import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double yr = sc.nextDouble();
            if (sal <= 0 || yr < 0) {
                System.out.println("Invalid input! Please enter again.\n");
                i--;   // decrement index to re-enter data
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }
        for (int i = 0; i < 10; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;   // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;   // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Zara Bonus Summary ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Employee " + (i + 1) +
                " | Old Salary = " + salary[i] +
                " | Bonus = " + bonus[i] +
                " | New Salary = " + newSalary[i]
            );
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}