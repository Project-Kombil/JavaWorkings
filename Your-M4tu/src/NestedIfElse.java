public class NestedIfElse {
    public static void main(String[] args){
        int a = 1, b=5;
        if (a >= 0){
            System.out.println("A is positive");
            if(b >= 0){
                System.out.println("b is positive");
            } else {
                System.out.println("b is negative");
            }
        } else {
            System.out.println("a is negative");
        }
    }
}
