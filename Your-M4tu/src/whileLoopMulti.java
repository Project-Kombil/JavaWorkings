import java.util.Scanner;
public class whileLoopMulti {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = object.nextInt();
        int eval = 1;
        System.out.println(0+" x "+num+" = "+"0");
        while(eval <= 12){
            int answer = eval * num;
            System.out.println(eval+" x "+num+" = "+answer);
            eval++;
        }
    }
}
