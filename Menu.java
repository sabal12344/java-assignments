//12
import java.util.Scanner;
public class Menu{
    static Scanner sc = new Scanner(System.in);
    static void areaSquare(){
        System.out.print("Enter length : ");
        double length = sc.nextDouble();
        System.out.println("Area = "+ (length*length));

    }
   static void areaRectangle(){
    System.out.print("Enter length : ");
    double length = sc.nextDouble();
    System.out.print("Enter width : ");
    double width = sc.nextDouble();
    System.out.println("Area = "+(length*width));

    }
    public static void main (String [] args){
       

  System.out.println("\nChoose a number");
        System.out.println("1. Find Area of Square.\n2.Find Area of Rectangle\n3.Exit.\n");
        while(true)
        {
        System.out.print("\nEnter your choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 :{
                areaSquare();
                break;
            }
            case 2:{
                areaRectangle();
                break;
            }
            case 3:{
                System.out.println("Terminating successfully...");
                System.exit(0);
            }
            default:{
                System.out.println("Invalid input.\n");
            }
            
        }

    }

    }
}