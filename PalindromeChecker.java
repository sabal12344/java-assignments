//14
import java.util.Scanner;
public class PalindromeChecker{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp!=0){
            rev = rev * 10 + (temp%10);
            temp/=10;
        }
        String result = (rev==num)? "Palindrome!" : "Not Palindrome!";
        System.out.println(result); 

    }
}