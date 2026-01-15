import java.util.*;
public class PriceOfItem{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int quantity,price;
quantity=sc.nextInt();
price=sc.nextInt();
int TotalPrice = quantity * price;
System.out.println("The total price is "+TotalPrice);
}
}