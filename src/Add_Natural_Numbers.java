/*
     IN THIS PROGRAM WE ADD THE NUMBERS
     int num = 5
     EX: 1+2+3+4+5 = 15
 */


public class Add_Natural_Numbers {
    public static void main(String[] args){
        int num = 6;
        int sum = 0;
        for(int i =1 ;i<=num;i++){
            sum = sum+i;
        }
        System.out.println("Total sum is :"+ sum);
    }
}
