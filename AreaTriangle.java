
//5) Write a program to find area of triangle.
import java.util.Scanner;


public class AreaTriangle {
public static void main(String[ ] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Length of Base of triangle (in cm) :");
       double base = sc.nextDouble();
       System.out.print("Height of triangle (in cm) :");
       double height = sc.nextDouble();

     System.out.println("\nThe area of that triangle is "+ (0.5*base*height) +" centimeters square");



}
}
