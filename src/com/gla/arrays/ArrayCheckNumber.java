import java.util.Scanner;
public class ArrayCheckNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=5;
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<length;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" is positive and even number");
                }else{
                    System.out.println(arr[i]+" is positive and odd number");
                }
            }else if(arr[i]<0){
                System.out.println(arr[i]+" is negatice number");
            }else{
                System.out.println("number is zero");
            }
        }
        if(arr[0]==arr[4]){
            System.out.println("the first and last elements of the array are equal");
        }else if(arr[0]>arr[4]){
            System.out.println("first element is greater than last elemnt");
        }else if(arr[0]<arr[4]){
            System.out.println("first element is smaller than last elemnt");
        }
    }
}