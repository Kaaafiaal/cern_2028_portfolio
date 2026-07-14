import java.util.Scanner;
public class ElectricityBill{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Electricity Consumed: ");
        double elec = sc.nextInt();
        double bill;

        if(elec<100 && elec>0){
            if(age<18){
               bill = (15*elec)-(elec*0.2*15);
               System.out.print("Final Bill: "+bill+"Taka");
            }
            else if(age>=18 && age<60 ){
                bill = (15*elec);
                System.out.print("Final Bill: "+bill+"Taka");
            }
            else{
                bill = (15*elec)-(elec*0.1*15);
                System.out.print("Final Bill: "+bill+"Taka");
            }
        }
        else{
            if(age<18){
                bill = (15*elec)-(15*elec*0.2);
                bill= bill+(bill*0.05);
                System.out.print("Final Bill: "+bill+"Taka");
            }
            else if(age>=18 && age<60 ){
                bill = (15*elec);
                bill = bill +(bill*0.05);
                System.out.print("Final Bill: "+bill+"Taka");

            }
            else{
                bill = (15*elec)-(elec*0.1*15);
                bill= bill+(bill*0.05);
                System.out.print("Final Bill: "+bill +"Taka");

            }
        }

    }
}