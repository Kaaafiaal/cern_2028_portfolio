import java.util.Scanner;
public class Hogwarts {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of Herbs(H): ");
        int H = sc.nextInt();
        System.out.print("Please enter number of Crystals(C): ");
        int C = sc.nextInt();
        int potion = 0;
        while(H>=3 && C>=2) {
            H = H - 3;
            C = C - 2;
            potion = potion + 1;
            System.out.println("Potion- " + potion + "created");
            System.out.println("Remaining Herbs: " + H + ", " + "Remaining Crystal: " + C);
        }
        if(potion%2 == 0){
            System.out.println("Potions Created: "+potion);
            System.out.println("Stable Elixir");
        }
        else{
            System.out.println("Potion Created: "+potion);
            System.out.println("Volatile Elixir");

        }
        }
    }

