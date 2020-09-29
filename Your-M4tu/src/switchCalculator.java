import java.util.Scanner;
public class switchCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Here I have a Simple Calculator with the 4 basic operations : Addition(+),Subtraction(-),Multiplication(*) and Division(/)");
        System.out.println("Enter your preferred Operator Option: ");
        char operator = sc.next().charAt(0);
        System.out.println("Your chose the Operator : "+operator);
        System.out.println("Enter Value 1 to evaluate: ");
        float val1 = sc.nextFloat();
        System.out.println("Enter value 2 to evaluate : ");
        float val2 =   sc.nextFloat();

        switch (operator){
            case '+' :float result = val1 + val2;
            System.out.println(val1+" + "+val2+" = "+result);
                break;
            case '-' : result = val1 - val2;
                System.out.println(val1+" - "+val2+" = "+result);
                break;
            case '*' : result = val1 * val2;
                System.out.println(val1+" * "+val2+" = "+result);
                break;
            case '/' : result = val1 / val2;
                System.out.println(val1+" / "+val2+" = "+result);
                break;
            default : System.out.println("Please Enter a valid Operator(+,-,* or /)");

        }
    sc.close();
    }
}
