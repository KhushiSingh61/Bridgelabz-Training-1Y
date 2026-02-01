import java.util.Scanner;
public class NumberArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter number : ");
		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
	}
	for(int i=0;i<num.length;i++){
		if(num[i]>0){
			if(num[i]%2==0){
				System.out.println("Number is Positive and Even.");
			}else{
				System.out.println("Number is Positive and Odd.");
			}
		}else if(num[i]<0){
			System.out.println("Number is Negative.");
		}else{
			System.out.println("Number is Zero.");
		}
	}
	int first=num[0];
		int last = num[4];
		if(first==last){
			System.out.println("First and Last Number is Equal.");
		}else if(first>last){
			System.out.println("First Number is Greater.");
		}else{
			System.out.println("Last Number is Greater");
		}
	}
}