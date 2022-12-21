import java.util.Scanner;

public class Find_Factorial_Of_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial..");
        int num = sc.nextInt();

        int f = 1;

        for(int i=num;i>0;i--){
            f = f*i;
        }
        System.out.println("=> 5! is : "+f);
    }
}
