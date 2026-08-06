import java.util.Scanner;
public class LuckyID {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students to check: ");
        int S = sc.nextInt();
        for(int i = 1 ; i <= S; i++){
            // each input will now go through an iteration
            // since 1 is a power of 2 we will manually hard codeit
            System.out.print("Enter student ID: ");
            int ID = sc.nextInt();
            if(ID==1){
                System.out.println("Lucky ID");
            }
            else{
                //now a loop of 2 multiplies will be present
                // usually we can tell if a number is divisble by 2 or not
                // if we keep multiplying and reach it eventually
                //kind of like times table therefore we will now 2x2x2.. until we reach our desired
                //value or close to it , if we reach absolute closest we stop
                int product = 1;
                while(product<ID){
                    product = product *2 ;
                }
                // here if ID=8; product will keep multiplying until 8; and then skip the loop
                //and fall under the if conditions
                if(product==ID){
                    System.out.println("Lucky ID");
                }
                else{
                    System.out.println("Not Lucky");
                }
            }
        }
    }
}
