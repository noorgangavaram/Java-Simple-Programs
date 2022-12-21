public class Find_Largest_Among_3_numbers {
    public static void main(String[] args){
        int a = 84,b = 21,c = 54;
        if(a>=b && a>=c){
            System.out.println(a+" : a is bigger");
        }
        else if(b>=c && b>=a) {
            System.out.println(b+" : b is bigger");
        }
        else {
            System.out.println(c+" : c is bigger");
        }
    }
}
