import java.util.Scanner;
public class LeapYear{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // year needs to be divisble by 4 to be a leap year
        // if divisible by 100 --> is it divisible by 400
        // so basically first check is 100 -->
        // if it falls under 100 --> then 400 divide
        //if it does not fall under 100 zone ---> 4 divide

        if (year % 100 == 0 ){
            if(year%400==0){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+ " is NOT a leap year");
            }
        }
        else{
            if( year % 4 ==0 ){
                System.out.println(year+ " is a leap year");
            }
            else{
                System.out.println(year+" is NOT a leap year");
            }
        }

    }
}
