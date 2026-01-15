import java.util.*;
public class Calculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
float number1,number2;
number1=sc.nextFloat();
number2 = sc.nextFloat();

System.out.println("Addition = " + (number1 + number2));
System.out.println("Subtraction = " + (number1 - number2));
System.out.println("Multiplication = " + (number1 * number2));
System.out.println("Division = " + (number1 / number2));

}
}