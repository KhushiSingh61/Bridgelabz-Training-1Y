import java.util.*;
public class HandShakes{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double n;
n=sc.nextDouble();
double Total = (n*(n-1))/2;
System.out.println("The Number of possible HandShakes is "+Total);
}
}