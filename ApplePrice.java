
//3) Write a program to enter the price of apple per dozen and find the price of 10 apples.
import java.util.Scanner;


public class ApplePrice {
public static void main(String[ ] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the price of apple per dozen :");
       double price = sc.nextInt();
       
       System.out.println("The price of 10 apples is "+(price/12.0)*10);
}



}
