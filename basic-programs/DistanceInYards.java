import java.util.*;
public class DistanceInYards{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double D_Feet;
D_Feet=sc.nextDouble();
double yards = D_Feet/3;
double miles = yards/1760;
System.out.println("Your Height in yards is "+yards+ " and in miles is "+miles);
}
}