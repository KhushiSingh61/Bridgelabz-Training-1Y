import java.util.*;
public class NaturalNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if(num >= 0){
			int sum = num*(num+1)/2;
			System.out.println("The Sum of "+num+ " natural numbers is " +sum);
		}
		else{
			System.out.println("The Number "+num+ " is not a natural number.");
		}
		
			
		}
		
		
		
	}