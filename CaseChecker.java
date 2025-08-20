
//6) Write a program that checks whether the character is in uppercase or lowercase.
import java.util.Scanner;


public class CaseChecker {
public static void main(String[ ] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an alphabet : ");
       String str = sc.nextLine();
       char alphabet = str.charAt(0);

       if(alphabet>='a'&&alphabet<='z'){
        System.out.println("\nThe alphabet you entered is in lowercase.");
       }
       else if(alphabet>='A'&&alphabet<='Z'){
        System.out.println("\nThe aplhabet you entered is in Uppercase.");

       }
       else{
        System.out.println("\nThe character you entered is not an alphabet.");
       }

    



}
}
