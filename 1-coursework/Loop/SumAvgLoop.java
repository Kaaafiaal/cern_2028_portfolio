import java.util.Scanner;
public class SumAvgLoop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=N ; i++){
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum of "+N+ "no is: "+sum);
        double avg= sum/N;
        System.out.print("The Average is: "+avg);
    }
}
