import java.util.Scanner;
public class DigitSeperator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Counting the digits
        System.out.print("Enter the N-digit vault code: ");
        int N = sc.nextInt();
        int length = 0 ;
        int temp = N ;int divisor = 1;
        while (temp != 0) {
            temp = temp /10;
            length = length +1;
        }

        //Divisor
        for(int i = 1; i<length ; i++){
            divisor = divisor *10;
        }
        //seperating
        while(N!=0){
            int temp1 = N/divisor;
            N = N % divisor;
            divisor = divisor / 10;
            if(N == 0){
                System.out.print(temp1);
            }
            else {
                System.out.print(temp1+", ");
            }
        }
        }
    }

