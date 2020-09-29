import java.util.Scanner;


public class flowOfControlExe { //Using the if-else-if ladder statement to verify different conditions
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value : ");
        int val = sc.nextInt();
        if(val==0){
            System.out.println("The Value is 0");
        } else if(val%2==0){
            System.out.println("The value is EVEN");
        } else {
            System.out.println("The value is ODD");
        }

    }
}
