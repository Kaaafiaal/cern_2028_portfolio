public class multiples {
    public static void main(String [] args){
        int sum = 0 ;
        boolean checker = false;
        for(int i = 1 ; i<=600;i++){
            if(i%7==0 && i%9==0){
                 checker = true ;
            }
            if (i % 7==0 && checker == false) {
            sum = sum + i;
            }
            if(i%9==0 && checker == false ){
                sum = sum + i ;
            }
            checker = false ;
            }
        System.out.println(sum);
        }
    }

