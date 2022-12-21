/*
   IN THIS PROGRAM WE CHECK WHETHER THE CHARACTER IS ALPHABET OR NOT
   WE USE ASCII TO ACHIVE THIS

   IN THE BELOW CODE "IF CH VALUE IS GREATER THAN a VALUE AND LESS THAN VALUE z" OR "IF CH VALUE IS GREATER THAN A VALUE AND LESS THAN VALUE Z
 */

public class Chek_Character_is_Alphabet_Or_Not {
    public static void main(String[] args){
        char ch ='*';
        if (ch >= 'a' && ch <='z' || ch >='A' && ch <= 'Z'){
            System.out.println(ch +" : is alphabet");
        }
        else {
            System.out.println(ch + " : is not alphabet");
        }
    }
}
