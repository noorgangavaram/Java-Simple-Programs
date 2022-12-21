/*
PROGRAM TO CHECK IF TWO STRINGS ARE ANAGRAMS
 TWO STRINGS ARE SAID TO BE ANAGRAM IF WE CAN FORM THE FIRST STRING BY ARRANGING THE CHARACTERS OF ANOTHER STRING
 EX : BASHA , HASBA
 */

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String Fstring = sc.nextLine();

        System.out.println("Enter the Second string : ");
        String Sstring = sc.nextLine();

        // Converting string to lettres
        char[] lettresIn1st = Fstring.toCharArray();
        char[] lettresIn2nd = Sstring.toCharArray();

        //Sorting the lettres
        Arrays.sort(lettresIn1st);
        Arrays.sort(lettresIn2nd);

        boolean result = Arrays.equals(lettresIn1st,lettresIn2nd);

        if(Fstring.length() == Sstring.length()){
            if(result == true){
                System.out.println(Fstring + " and "+ Sstring + " are anagrams");
            }else {
                System.out.println(Fstring + " and "+ Sstring + " are not anagrams");
            }
        }
        else {
            System.out.println(Fstring + " and "+ Sstring + "are not anagrams");
        }
    }
}
