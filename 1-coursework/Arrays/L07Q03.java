import java.util.Scanner;
public class L07Q03 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N =sc.nextInt();
        double [] arr = new double [N];
        for(int i = 0 ; i <N ; i ++){
            System.out.print("Enter a number: ");
            arr[i]= sc.nextDouble();
        }
        double max = arr[0];
        int maxIndex = 0 ;
        double min = arr[0];
        int minIndex = 0;
        for(int i = 1 ;i<N ; i++ ){
            // i cannot use arr[i-1] > arr[i]
            // because it would compare first number second number
            //then if YES it would move on to 3rd and 2nd , where it will
            //allocate the highest number from 2nd and 3rd
            //forgetting the fist one
            //basically first er number gayeb hoie jabe
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i]<min) {
                min = arr[i];
                minIndex = i ;
            }
        }
        //summation loop
        double sum = 0.0;
        for(int i = 0 ; i< N ; i++){
            sum = sum + arr[i];
        }
        double average = sum/N ;

        System.out.println("Maximum element "+max+ "found at index "+maxIndex);
        System.out.println("Minimum element "+min+ "found at index "+minIndex);
        System.out.println("Summation: "+sum);
        System.out.printf("Average: %.2f ",average);



    }
}
