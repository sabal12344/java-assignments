import java.util.Scanner;
public class BinaryDecimal{
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal value : ");
         int dec = sc.nextInt();
         int [] bin_arr = new int [32];
         int i = bin_arr.length ;
         while(dec>1){

             i--;
            bin_arr[i] = dec%2;
            dec/=2;


         }
         i--;
         bin_arr[i]=dec;


         long bin = 0;
         for(int j =i;j<bin_arr.length;j++){
            bin = bin * 10 + bin_arr[j];

         }

        System.out.println("Binary equivalent = " + bin);
        System.out.print("Enter binary value : ");
        bin = sc.nextLong();
        int power = dec = 0;

        while (bin>0) {
            

           dec += (Math.pow(2,power))*(bin%10);
           bin/=10;
           power++;


        }
        System.out.println("Decimal quivalent = "+dec);
        

    }
}