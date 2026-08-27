//Here we basically create a scenario where a user inputs their number(int) and their name(string)
//and we sort it out in ascending order


import java.util.Scanner;
public class L07Q05 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] marks = {85, 90, 75, 44, 99};
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};


        for(int i = 0 ; i<marks.length-1;i++){
            for(int j = 0 ; j<marks.length-1-i;j++){
                if(marks[j+1]<marks[j]){
                    int temp = marks[j+1];
                    marks[j+1]= marks [ j];
                    marks[j]= temp ;

                    String temp_s = names[j+1];
                    names[j+1]= names[j];
                    names[j] =  temp_s;

                }
            }
        }

        System.out.println("Sorted Array: ");
        for(int i = 0 ; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for(int i = 0 ; i<marks.length;i++){
            System.out.print(names[i]+" ");
        }



    }

}
