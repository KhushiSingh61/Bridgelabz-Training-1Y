import java.util.Scanner;

public class FactorialForLoop{
       public static void main(String [] args){
	          Scanner sc = new Scanner(System.in);
			  
			  int n = sc.nextInt();
			  int factorial =1;
			  
			  if(n>0){
			  for(int i=1 ; i <n+1 ; i++){
			      factorial = factorial*i;
				  }
				  System.out.println("Fctorial of "+ n + " is " + factorial);
			  }else if(n<0){
				  System.out.println("Factorial for negative number is not possible.");
			  }else {
				  System.out.println("Factorial of Zero is 1.");
				  
		}
		
	}
}
	
			  