//13
public class FallThrough{
    public static void main(String [] args){
        int a = 2;
        switch (a){
            case 1:
            System.out.println("case 1 printed.");

            case 2:
            System.out.println("case 2 printed");

            case 3:
            System.out.println("case 3 printed.");

            case 4:
            System.out.println("case 4 printed.");

            case 5:
            System.out.println("case 5 printed.");
        }
    }
}