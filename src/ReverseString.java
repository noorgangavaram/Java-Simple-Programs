public class ReverseString {
     String reverse = "";                        //Declaring a variable to store the reverse value
    public void Reverse(String str){
        for (int i = str.length()-1; i>=0;i--){
            reverse = reverse + str.charAt(i);  //Adding the reverse characters to the reverse variable

        }
        System.out.println(reverse);             //Printing the reverse value
    }
    static public void main(String[] args){
        ReverseString revstr = new ReverseString(); //Creating a object to using the method in the ReverseString class
        revstr.Reverse("noor");                 //Calling the method from the class
    }
}
