public class LoopExample {
    public static void main(String[] args){
        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
            System.out.println("Sum is now "+sum+" and i is "+i);
        }
        System.out.println("The Sum of natural number "+n+" is "+sum);
    }
}
