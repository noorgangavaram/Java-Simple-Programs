import java.util.Scanner;
/*
   WRITE A PROGRAM TO CHECK WHETHER A STRING IS PALINDROME OR NOT
   IF WE CAN FORM THE SAME STRING BY REVERCING THE STRING
 */
public class Palindrome {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check whether it is palindrome or not");
        String original = scanner.nextLine();

        String reverseString = "";

        int strlength = original.length();

        for (int i = strlength-1;i>=0;i--){
             reverseString = reverseString +original.charAt(i);
        }

        System.out.println(reverseString);
        if(original.equals(reverseString)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
