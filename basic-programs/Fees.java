public class Fees{
    public static void main(String args[]){
        int fee = 125000;
        int Discount_Percent = 10;
        double discountamount = fee*Discount_Percent;
        double FinalFees = fee - discountamount;
        System.out.println("The Discount Amount is INR"+discountamount+"and final discounted fees is INR "+FinalFees);
    }
    }