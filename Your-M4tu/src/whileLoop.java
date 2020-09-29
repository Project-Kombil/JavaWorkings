public class whileLoop {
    public static void main(String[] args){
        int i = 586; //initialization
        int n = i;
        int rev = 0;
        while( i > 0){ //condition
            int d = i % 10; //remainder
            rev = rev * 10 + d;
            i = i/10; //update
        }
        System.out.println("Reverse form of "+n+" is "+rev);
    }
}
