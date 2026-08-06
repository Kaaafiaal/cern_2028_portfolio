import java.util.Scanner;
public class MaxNumMinNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float max ;
        float min;
        max = num1;
        min = num1;
        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        if(num2<min){
            min = num2;
        }
        if(num3<min){
            min = num3;
        }
        System.out.println("Maximum number is " +max);
        System.out.println("Minimum number is "+ min);
    }
}
