/* 11*/
import java.util.Scanner;
public class Results{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        boolean fail=false;
        int [] marks = new int [5];
        for(int i = 0; i<marks.length; i++){
            System.out.print("Marks of Subject "+(i+1) + " : ");
            marks[i]=sc.nextInt();
            if(marks[i]<40)
            fail = true;
        }

        System.out.print ("\nResult : ");
        String result;

        if(!fail){
            int sum = 0;
            for(int i = 0; i < marks.length; i++){
                sum += marks[i];
            }
            double percentage =  sum / (double) marks.length;
            
            result = (percentage>=80)?"Distinction" 
            :(percentage>=60)?"First division"
            :(percentage >= 50)?"Second division"
            :"Third division";

                }

                else{
                    result = "Fail";

                }

                System.out.print(result);

        

    }
}