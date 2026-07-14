import java.util.Scanner;
public class GradingsystemAndChargingStationCombined{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of litres of water used");
        double litre = sc.nextDouble();
        System.out.println("Are you in an educational facility plan, please either enter true or false");
        boolean isSchool = sc.nextBoolean();
        boolean isSchoolToggle;


        if(litre>0 && litre <=50){}
        if(litre>50 && litre <=150){}
        if(litre>150){}

        //surge usage // it's a given that here the usage of litre will be above 150
        if( isSchool == true){

        }



    }
}