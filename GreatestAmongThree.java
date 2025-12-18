
//
public class GreatestAmongThree{
    public static void main(String []args){
        int a = 40, b = 40 , c = 10;
        System.out.print("The greatest number is ");
        int greatest = (a>=b&&a>=c) ? a : (b>a &&b >=c)? b : c;
        System.out.print(greatest);
    }
}