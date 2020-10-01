public class Example {
    public static void main(String[] args){
        float i = 586; //initialization
        float n = i;
        float rev = 0;
        while( i > 0){ //condition
            float d = i % 10; //remainder
            rev = rev * 10 + d;
            i = i/10; //update
        }
        System.out.println("Reverse form of "+n+" is "+rev);
        System.out.println(i);
    }
}