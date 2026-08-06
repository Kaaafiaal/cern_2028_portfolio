import java.util.Scanner;
public class GymFit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Members: ");
        int members = sc.nextInt();
        //we used sum outside of inner loop so it resets evertime i access into new exercise,




        for(int i = 1 ; i<=members ; i++){


            System.out.print("Exercises for Member-"+i+": ");
            int exercises = sc.nextInt();
            if(exercises>3){
                System.out.println("(Can’t do more than 3 exercise)");
                exercises = 3;
            }

                boolean islessthan200 =true;
                double Sum = 0 ;
                double rawSum = 0;
                for(int j = 1 ; j<=exercises; j++){
                    System.out.print("Exercise- "+j+ ": ");
                    int calorie = sc.nextInt();
                    double calorieBurnt = calorie;
                    rawSum =rawSum + calorie;
                    //i got calorie
                    //now conditions
                    //i used an extra variable to convert int to double and use it

                    if(calorie>350){
                        calorieBurnt = calorieBurnt+ (calorieBurnt*0.5);
                    }
                    //summing up everything
                    Sum=Sum+calorieBurnt;
                    //now i see that i need to work on
                    //pentalty for ALL if EVERYYY exercise that means
                    // i need to remember if every exercise is below 200
                    // for remembering i use boolean
                    //now since i need atleast just 1 exercise to be greater than 200
                    //i can simply just set the condition in that way
                    if(calorieBurnt>=200){
                        islessthan200= false;
                    }
                    // so basically i could've gone for calorie<200--> true;
                    // but it would fail if it had 1 value higher than normal// it wouldnt detect becauset
                    //the switch has been flipped once
                    //main mechanism to remember is : ONCE IT FLIPS IT FLIPS
                    //if one nmumber crosses 200 and over then it's no longer "every number is less than 200
                    //



                }
                if(islessthan200==true){
                    Sum = Sum - (Sum*0.1);
                }

                double rawAvg = Sum/exercises;
                if(rawAvg>400){
                    Sum= Sum+(50*exercises);
                }
                double finalAvg = Sum/exercises;
                System.out.printf("Average calories earned per day for Member-%d: %.3f\n", i, finalAvg);

        }
    }
}
