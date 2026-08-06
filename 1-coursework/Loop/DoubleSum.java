import java.util.Scanner;

public class DoubleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int STRL = 0;
        int sum = 0;
        System.out.println("Enter number of Weeks, W:");
        int W = sc.nextInt();
        for (int i = 1; i <= W; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            STRL = STRL - sum;
        }
        System.out.println("STRL= " + STRL);
    }

}
