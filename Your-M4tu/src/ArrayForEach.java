import java.util.Scanner;

public class ArrayForEach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum= 0;
        System.out.println("Enter your values:");
        for (int i = 0;i < a.length; i++) {
            a[i] = sc.nextInt();
        }
            for(int num : a){
                sum = sum + num;
            }

        System.out.println(sum);
    }
}
