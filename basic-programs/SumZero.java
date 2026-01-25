import java.util.Scanner;

public class SumZero{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   
	   double n=sc.nextDouble();;
	   double sum =0;
	  
	  while(n!=0){
		  sum = sum + n;
		  
		  System.out.println("Enter number again for the sum : ");
	     
 		  n = sc.nextDouble();
	
	   
	  }
	  
	  System.out.println("Total sum until zero is " + sum);
}
}