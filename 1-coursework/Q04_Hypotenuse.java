//Question-04
//using Math.sqrt
public class Q04_Hypotenuse {
    public static void main(String [] args){
        int a = 10;
        int b = 13;
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        // apparently, Math.sqrt does not work wiht int data type
        System.out.println(hypotenuse);
    }

}
