import java.util.Scanner;
/*
    if the reminder is equal to zero then the number is even else odd
 */
public class CheckNumber_Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even number");
        }
        else{
            System.out.println(num+" is odd number");
        }
    }
}
