import java.util.Scanner;

public class forLoopFactorial {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your factorial number ");
                int n = sc.nextInt();
                int sum = 1;
                for (int i = 1; i <= n; i++){
                    sum = sum * i;
                    System.out.println("Sum is now "+sum+" and i is "+i);
                }
                System.out.println("The Factorial of "+n+" is "+sum);
                sc.close();
            }
        }


