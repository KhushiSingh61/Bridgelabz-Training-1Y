import java.util.Scanner;
public class VotingCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		System.out.println("Enter age : ");
		for(int i=0;i<age.length;i++){
			age[i] = sc.nextInt();
	}
	for(int i=0;i<age.length;i++){
		if(age[i]<0){
			System.out.println("Invalid Age");
		}else if(age[i]<=18){
			System.out.println("Can not vote");
		}else{
			System.out.println("Can Vote");
		}
	}
	}
}