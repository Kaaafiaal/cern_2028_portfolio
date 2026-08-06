// CSE110 - Week 1 Assignment
// Purpose: Practice variables and data types
// Author: Kafial Muhimmat
// Date: May 2025

//Question-01
//Converting minutes ---> year, days
// Familiarizing with modulus

public class Q01_MinutestoYear{
    public static void main(String [] args){
        int minute =  3456789;
        int year = minute/(365*24*60) ;
        int days =  (minute % (365*24*60))/(24*60);
        System.out.println(minute+" minutes is approximately "+year+"years and "+days+" days");
        int test =minute % (365*24*60) ;
        System.out.println(test);
    }
}
//flawed logic (minute%(365*24*60))/24*60;
/*on my above, flawed code, let me try to trace what the computer did.
it entered the code
it saw that there's () it entered (minute % (365*24*60)) and saw that there's another () so it calculated 365*24*60 then did the modulus , which yielded 303189
now there's 303189/24*60;
now it did 303189/24
but i wanted to do 24*60

but by adding (24*60) i was successfully able to , calculate properly */
