import java.util.Scanner;//32
public class Percentage{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] arr = new int [5];
        int sum = 0;
        for(int i = 0 ; i<5; i++){
            System.out.print("Marks of subject "+ (i+1)+" : ");
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("\nThe percentage is "+(sum/5.0));


    }
}