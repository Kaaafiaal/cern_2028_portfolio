import java.util.Scanner;
public class SubmarineOxygen {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("O = ");
        int O = sc.nextInt();
        System.out.print("T = ");
        int T = sc.nextInt();
        boolean checker = false;
        int surfacedat = 0;
        for (int i = 1; i <= T; i++) {
            if (i % 4 == 0) {
                O = O - 6;
            } else if (i % 6 == 0) {
                O = O + 3;
            } else {
                O = O - 2;
            }
            if (O < 0) {
                checker = true;
                surfacedat = i;
            }
        }
        if (checker == false) {
            System.out.print("All explored, " + O + " Oxygen Left");
        } else if (checker == true) {
            System.out.print("Surfaced at Trench" + surfacedat);

        }
    }}


