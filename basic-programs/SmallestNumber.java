import java.util.*;
public class SmallestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number1,number2,number3;
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		if(number1 <= number2 && number1 <= number3){
			System.out.println("First Number is Smallest");
		}
		else if(number2 <= number1 && number2 <= number3){
			System.out.println("Second Number is Smallest");
		}
		else{
			System.out.println("Third Number is Smallest");
		}
		
			
		}
		
		
		
	}
