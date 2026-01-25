import java.util.Scanner;

public class Factorial{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n=sc.nextInt();
	   int factorial = 1;
	   int i=1;
       
	   if(n>0){
	   while(i<n+1){
	   factorial = factorial*i;
	   i++;
	   }
	   System.out.println("Factorial of " + n + " is " + factorial);
	   
	   }else if (n<0){
	   System.out.println("Factorial for negative number is not possible.");
	   }else {
	   System.out.println("Factorial of " + n + " is " + factorial);
	   }
	  
}
}