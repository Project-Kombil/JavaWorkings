import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int init = n;
        int SumA = 0;
        while(n > 0){
            int y = n % 10;
            SumA = SumA + y*y*y;
            n = n / 10;
        }
        if(init == SumA){
            System.out.println("n is = to "+SumA);
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

}
