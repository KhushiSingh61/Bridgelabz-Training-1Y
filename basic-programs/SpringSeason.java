import java.util.Scanner;
public class SpringSeason{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Month,Day;
		System.out.println("Enter Month:");
		Month = sc.nextInt();
		System.out.println("Enter Day:");
		Day = sc.nextInt();
		if((Month == 3 && Day >=20) ||(Month ==4) || (Month == 5) || (Month==6 && Day <=20) ){
			System.out.println("It's a Spring Season.");
		}
		else{
			System.out.println("Not a Spring Season.");
		}
		
			
		}
		
		
		
	}
