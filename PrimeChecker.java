//15
import java.util.Scanner;
public class PrimeChecker{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        boolean prime = true;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i==0){
            prime = false;
            break;
        }

        }
        System.out.println((prime)?"Prime!" : "Not prime!");
    }
}