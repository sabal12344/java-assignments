
//4) Write a program that takes character as input and displays whether it is vowel or consonant.
import java.util.Scanner;


public class VowelChecker {
public static void main(String[ ] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a character :");
       String str = sc.nextLine();
       str = str.toLowerCase();
       char c = str.charAt(0);

       if(c<='z'&&c>='a'){
       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
       System.out.println("\nThe character is a vowel alphabet.");
       else
       System.out.println("\nThe character is a consonant alphabet");
}
else{
       System.out.println("\nThe character is not an alphabet.");
}
}



}
