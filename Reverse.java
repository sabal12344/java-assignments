import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        while(!(a>99&&(a/1000==0))){
        System.out.print("Enter a three digit number : ");
        a = sc.nextInt();
    }
        int rev = 0;
        while (a!=0){
            rev = rev*10 + (a%10);
            a/=10;
        }
    System.out.println("The reverse is "+rev);


    }
}