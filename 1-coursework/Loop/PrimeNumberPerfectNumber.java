import java.util.Scanner;
public class PrimeNumberPerfectNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int num=sc.nextInt();
        int count = 0;

        for(int i =1 ; i < num;i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println(num+ " is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }

        int sum = 0 ;
        for(int j = 1 ; j<num ; j++){
            if(num%j==0){
                sum= sum + j;
            }
        }
        if(sum == num){
            System.out.println( num +" is a perfect number");
        }
        else{
            System.out.println(num+ " is not a perfect number");
        }



    }

}
