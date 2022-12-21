/*

 Fibonacci series is a series of numbers where after the inital two numbers,
 every occuring numbers is the sum of two preceding numbers
 Example : 0+1=1,1+1=2,1+2=3,
        => 0,1,1,2,3,5,8,13,......

 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){

        int a = 0,b=0,c=1;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + " ");
        }

    }
}
