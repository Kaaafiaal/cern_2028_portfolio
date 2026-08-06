import java.util.Scanner;
public class SuperShopBillingSoftware {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");
    int cost = sc.nextInt();
    System.out.println("Enter the amount,customer gave(Taka)");
    int paid = sc.nextInt();
    int change = paid - cost  ;
    // converting each cash type into a variable
    int note_100;
    int note_50;
    int note_20;
    int note_10;
    int coin_5;
    int coin_2;
    int coin_1;
    int temp; // a palceholder

 if(change<0){
     System.out.println("Please pay "+change + "more");
 }
 else if(change==0){
 System.out.println("The returned amount is"+change+" taka");
 }
 else{
     //here the process of seperation of change will be done
     // so ekhane 410 taka hole, 4 ta 100 taka , 1 ta 10 taka er moto hobe

     note_100 = change/100;
     System.out.println("100 taka note: "+note_100);
     temp = change%100;
     //doing modulus tells us how much we is left AFTER WE EQUALLY DIVIDE

     note_50 = temp/50;
     System.out.println("50 taka note: "+note_50);
     temp = temp %50;

   note_20 = temp/20;
   System.out.println("20 taka note: "+note_20);
   temp = temp %20;

   note_10 = temp/10;
   System.out.println("10 taka note: "+note_10);
   temp = temp %10;

   coin_5 = temp/5;
   System.out.println("5 taka coin: "+coin_5);
   temp = temp%5;

   coin_2 = temp/2;
   System.out.println("2 taka coin: "+coin_2);
   temp = temp%2;

   coin_1 = temp/1;
   System.out.println("1 taka coin: "+coin_1);


 }
}
}
