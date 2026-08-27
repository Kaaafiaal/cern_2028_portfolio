import java.util.Scanner;
public class L07Q02 {
    public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("N = ");
int N = sc.nextInt();

int [] arr = new int [N];
for(int i = 0 ; i<N ; i++){
    System.out.print("Enter a number: ");
    arr[i]= sc.nextInt();
}
int num = sc.nextInt();
boolean found = false ;
for(int i = 0 ; i<N ; i++){
    if (num == arr[i]){
        found = true;
        System.out.print(num+" is at index "+i);
        break;
    }
}
if(found == false ){
    System.out.print("Element not found");
}
    }
}
