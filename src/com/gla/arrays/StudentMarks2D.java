import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = new int[students][3];

        double[] percentage = new double[students];
        char[] grade = new char[students];
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 75) {
                grade[i] = 'A';
            } else if (percentage[i] >= 60) {
                grade[i] = 'B';
            } else if (percentage[i] >= 40) {
                grade[i] = 'C';
            } else {
                grade[i] = 'F';
            }
        }
        System.out.println("\n--- Student Result ---");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Percentage = " + percentage[i] +
                    "% | Grade = " + grade[i]);
        }
    }
}