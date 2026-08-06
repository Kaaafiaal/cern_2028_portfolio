//Question-04
//using Math.sqrt
public class Q03_NumberExtraction {
    public static void main(String [] args){
        int id =1000054943;
        int last_num = id%10; // 3
        int second_last_num = (id%100)/10;//4
        System.out.println("10000549"+ last_num+second_last_num);
    }
}
// here modulus by ten, means grabbing the last digit of a tens number
// taking the int after dividing by ten , means taking the front number
//so mod means right number, divide means left ; short mnemonic to remember

