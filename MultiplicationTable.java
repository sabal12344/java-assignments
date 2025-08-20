
//2
import java.util.Scanner;


public class MultiplicationTable {
public static void main(String[ ] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number :");
       int x = sc.nextInt();
       
       for(int i=1;i<=10;i++){
              System.out.print("\n"+x+" x "+i+" = "+(x*i));
       }

}



}

