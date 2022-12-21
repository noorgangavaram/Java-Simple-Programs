/*
Finding duplicate characters in a string
 */

public class FindDuplicateCharacters {
    public static void main(String[] args){

        String sentense = "java";
        System.out.println(sentense);
        String characters = ""; //It stores all characters in the string
        String duplicates = "";//This will store all the duplicate characters

        for(int i=0;i<sentense.length();i++){
            String current = Character.toString(sentense.charAt(i)); //it convert the string to characters
            if(characters.contains(current)){
                if(!duplicates.contains(current))//If current character dosen't contain in the duplicates than add it to the duplicates
                {
                    duplicates = duplicates+current;//adding the current to duplicates
                }
            }
           characters = characters+current; //We are adding the current characters to the "characters"
        }
        System.out.println("Duplicate characters are the : "+duplicates);
    }
}