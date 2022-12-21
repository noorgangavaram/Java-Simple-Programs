/*
 WRITE A PROGRAM TO CHECK WHETHER A NUMBER IS ARMSTRONG
 ARMSTRONG MEANS 153 => 1^3 + 5^3 + 3^3 = 153
 */


import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter a nnumber");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;       // we use temp why because, at comparision time it will be helpful
        int result = 0;

        while (temp>0){
            int lastDigit = temp%10;  //IT GIVES THE LAST DIGIT NUMBER
            result = result + lastDigit*lastDigit*lastDigit;
            temp =temp/10;
        }

        if(result == num){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not Armstrong Number");
        }

    }
}