import java.util.Scanner;
public class SalesTaxCalculation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int day = sc.nextInt();
        for(int i = 1 ; i <=day; i ++){
            System.out.println("Enter sales for Day "+i+":");
            double nettaka=0;
            for(int j = 1 ; j<= 3 ; j ++){
                int tk = sc.nextInt();
                nettaka=nettaka+tk;
            }
            // the main trick here is that i used 100-->200-->500 first
            //which initially resulted in me getting false numbers or weird numbers
            //basically the rule is to if it's a greater than checking state
            //check it by the large numbers first
            if(nettaka>=500){
                nettaka=nettaka+ (0.1*nettaka);
                System.out.println("Day "+i+" :"+" Total Sales with Tax: "+nettaka);
            }
            else if (nettaka>=200){
                nettaka = nettaka +(0.05*nettaka);
                System.out.println("Day "+i+" :"+" Total Sales with Tax: "+nettaka);
            }
            else if(nettaka>=100){
                nettaka = nettaka + (0.02*nettaka);
                System.out.println("Day "+i+" :"+" Total Sales with Tax: "+nettaka);

            }
        }

    }
}
