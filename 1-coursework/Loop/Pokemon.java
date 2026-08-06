import java.util.Scanner;
public class Pokemon {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Energy (E): ");
        int E = sc.nextInt();
        System.out.print("Number of River(N): ");
        int N = sc.nextInt();
        for(int i =1; i<=N; i++){
            System.out.print("enter River Distance D"+i+" :");
            int D = sc.nextInt();
            if(D<=5){
                E=E-2;
            }
            else if(D>5){
                E=E-(D/2);
            }
            if(E<0){
                System.out.println("Tired at River " + i);
                break;
            }
        }
        if (E > 0) {
        System.out.println("All Done");
        System.out.println(E + " energy left");
        }
        }
    }

