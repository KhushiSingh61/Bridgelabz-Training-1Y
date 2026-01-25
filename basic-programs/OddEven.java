import java.util.Scanner;

public class OddEven{
       public static void main(String [] args){
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   
	   if(n>0 ){
		   if(n%2==0){
	            for(int i=1;i<n+1;i++){
			       if(i%2==0){
				   System.out.println("Even number till "+ n + " contain " + i);
				   }
				}
		   }else{
		  
                for(int j=1;j<n+1;j++){
                   if(j%2 !=0){
				   System.out.println("Odd number till "+ n + " contain " + j);
                   }
				}
		   }
			
	    }else{
	    System.out.println("'Number is not natural number.");
	   }
	   }

}