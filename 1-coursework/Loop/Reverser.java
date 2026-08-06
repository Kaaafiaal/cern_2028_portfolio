import java.util.Scanner;
public class Reverser {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp;
        while(num!=0){
            temp = num % 10 ;
            System.out.print( temp+ ", ");
            num= num/10;
            if(num == 0){
                System.out.print(num);
            }
        }
    }
}
