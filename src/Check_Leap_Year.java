
/*
     year % 4 == 0
     year % 100 == 0
     year % 400 == 0
       then leap year
     otherwise
       not leap year
 */

public class Check_Leap_Year {
    public static void main(String[] args){
        int year = 2012;
        boolean leap = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else {
                leap = true;
            }
        }
        else {
            leap = true;
        }

        if(leap){
            System.out.println(year+ " : is leap year");
        }
        else {
            System.out.println(year+" : is not leap year");
        }
    }
}
