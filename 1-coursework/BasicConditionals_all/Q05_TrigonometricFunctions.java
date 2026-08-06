//Question-05
//Math.sqrt usage
public class Q05_TrigonometricFunctions {
    public static void main(String [] args){
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt((a*a)+(b*b));
        double sinA = a/c;
        double cosA= b/c ;
        double sinB = b/c;
        double cosB = a/c;
        System.out.print("sin(A):"+sinA+" ,cos(A):"+cosA+" ,sin(B):"+sinB+" ,cos(b):"+cosB);
    }
}

