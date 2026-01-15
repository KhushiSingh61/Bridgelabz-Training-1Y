import java.util.*;
public class ConvertHeight{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int Height;
Height=sc.nextInt();
double heightinc = Height/2.54;
int feet = (int)(heightinc/12);

System.out.println("Your Height in cm " +Height+ " while in feet is " +feet+ " in inches is"+heightinc);

}
}
