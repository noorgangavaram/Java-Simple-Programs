/*

   WE USE BUILT-IN FUNCTION replaceAll() to replace the space in the string

 */

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        String str1 = "My   na  me is        Noor Mohammad";
        String str2 = str1.replaceAll("\\s","");
        System.out.println(str2);
    }
}
