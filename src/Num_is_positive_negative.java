public class Num_is_positive_negative {
    public static void main(String[] args){
        int num = -3;

        //IF THE NUM IS LESS THAN 0
        if(num > 0.0){
            System.out.println(num+" : is positive");
        }
        //IF THE NUM IS GREATER THAN 0
        else if(num < 0.0){
            System.out.println(num +" : is negative");
        }
        //IF BOTH TEST EXPRESSION ARE EVALUATED TO FALSE
        else {
            System.out.println(num +" : is zero");
        }
    }
}
