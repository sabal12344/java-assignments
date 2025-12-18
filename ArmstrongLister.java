import java.util.Scanner; //27
public class ArmstrongLister{
    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(temp>0){

            sum += Math.pow(temp%10,digits);           

            temp/=10;

        }
        return (sum==n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Value of m : ");
        int m = sc.nextInt();
        System.out.print("Value of n : ");
        int n = sc.nextInt();

        System.out.println("The armstrong numbers between "+m + " and "+n);

        for(int i = m; i<=n; i++){
            if(isArmstrong(i))
            System.out.print(i+" ");
        }

    }
}