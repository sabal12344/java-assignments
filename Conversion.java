//25
import java.util.Scanner;
public class Conversion{
    
  
   static double inchAndFeet(double value, int opt){
    if(opt==0)
    return 12*value;

    else
    return value/12.0;

    }

    static double kgAndPounds(double value, int opt){

        if(opt==0)
       
            return (value*2.2);

       else
            return (value/2.2);      
              
   
    }
  

    
    static double usdAndNpr(double value, int opt){
         if(opt==0)
         return value * 143;

         else
         return value/143;
    }
    

    
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
       


        System.out.println("1.Feet to inch\n2.Inch to feet\n3.KG to pounds\n4.Pounds to KG\n5.USD to NPR\n6.NPR to USD\n7.Exit");
        while(true)
        {
        System.out.print("\nEnter your choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 :{
                 System.out.print("How many feet : ");
            double feet = sc.nextDouble();
                System.out.println("= "+inchAndFeet(feet, 0)+" inches");
                break;
            }
            case 2:{
                  System.out.print("How many inches: ");
            double inches = sc.nextDouble();
                System.out.println("= "+inchAndFeet(inches, 1)+" feet");
                break;
            }
            case 3:{
                  System.out.print("How much kg : ");
            double kg = sc.nextDouble();
                System.out.println("= "+kgAndPounds(kg, 0)+" lbs");
                break;
            }
            case 4:{
                  System.out.print("How much lbs : ");
            double lb = sc.nextDouble();
                System.out.println("= "+kgAndPounds(lb,1)+" kg");
                break;
            }

            case 5:{
                  System.out.print("How much USD : ");
            double usd = sc.nextDouble();
                System.out.println("= "+usdAndNpr(usd,0)+" npr");
                break;
            }
            case 6:{
                  System.out.print("How much NPR : ");
                   double npr = sc.nextDouble();
                System.out.println("= "+usdAndNpr(npr, 1)+" usd");
                break;
            }

            case 7:{
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
