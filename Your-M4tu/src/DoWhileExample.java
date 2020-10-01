import java.util.Scanner;
public class DoWhileExample {
    public static void main(String[] args){
        Double number, sum = 0.0; //initialization
        Scanner input = new Scanner(System.in);
        do{
           System.out.print("Enter a number: ");
           number = input.nextDouble();
           sum += number; //update
        } while (number!=0.0); // condition
            System.out.println("Sum = "+sum);
            input.close();
    }
}
