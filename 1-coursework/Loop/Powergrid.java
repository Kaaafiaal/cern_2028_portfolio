import java.util.Scanner;
public class Powergrid {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter Number of Days: ");
        int days= sc.nextInt();
        int power = 40;
        boolean checker = false;
        int blackout_iteration;
        int blackout_day;
        for(int i = 1 ; i<= days && checker == false ; i++){
            if(i%3==0){
                power = power - 45;
            }
            else if (i%5==0){
                power = power +25;
            }
            else{
                power = power +10;
            }

            if(power>500){
                power = power-50;
            }
            if(power<=0){
                System.out.println("blackout on Day "+i);
                checker = true;
                blackout_iteration = i;

            }
        }
        if(checker==false){System.out.println("Final Power: "+power);}

    }
}
