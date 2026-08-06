import java.util.Scanner;
public class TriangleTypeFinder{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c){
            System.out.println("This is an Equilateral Triangle");
        }
        else if(a==b || b==c){
            System.out.println("This is an Isosceles Triangle");
        }
        else{
            System.out.println("This is an Scalene Triangle");
        }

    }
}
