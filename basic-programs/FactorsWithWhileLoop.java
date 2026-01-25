import java.util.Scanner;

public class FactorsWithWhileLoop{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   int i=1;
	    
		if(n>0){
			
			while(i<=n){
				 if(n%i==0){
					 System.out.println("Factors of number "+  n + " contain " + i);
					 }
					 i++;
			}
		}else{
			System.out.println("YOU given number is not positive integer.");
		}
	   }
}