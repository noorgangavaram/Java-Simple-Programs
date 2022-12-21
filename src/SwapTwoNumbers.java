public class SwapTwoNumbers {
    public static void main(String[] args){
        int x = 10;
        int y = 30;
        /*
        // THIS IS DONE BY USING THE THIRD VARIABLE
        int temp;
        System.out.println("Before swaping  x = : " + x + "  y = : " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swaping  x = : " + x + "  y = : " + y);
         */

        // THIS IS DONNE BY WITHOUT USING THIRD VARIABLE
        System.out.println("Before swaping  x = : " + x + "  y = : " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swaping  x = : " + x + "  y = : " + y);


    }
}
