import java.util.Scanner;
public class forLoopSumOfNatural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your natural number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
            System.out.println("Sum is now "+sum+" and i is "+i);
        }
        System.out.println("The Sum of the natural number "+n+" is "+sum);
        sc.close();
    }
}
