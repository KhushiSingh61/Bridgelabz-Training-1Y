import java.util.*;
public class DiscountFees{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int fees;
int DiscountPercent;
fees=sc.nextInt();
DiscountPercent = sc.nextInt();
double discountamount = fees*DiscountPercent;
double FinalFees = fees-discountamount;

System.out.println("The Discount Amount is INR"+discountamount+"and final discounted fees is INR "+FinalFees);

}
}
