import java.util.Scanner;
public class First {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A Name");
        String x = input.next();
        Person P1 = new Person(x);

        System.out.println("Enter Your Year Of Birth");
        int y = input.nextInt();
        P1.Return(y);

        Employee E1 = new Employee();
        E1.set(5);
        System.out.println("Number of Years of Experience: "+E1.get());

    }
}

class Person{
    private String name;
    private int DOB;

    Person(){
    }

    Person(String x){
        name = x;
    }

    void Return(int x){
        System.out.println("Name: "+name);
        DOB = 2020 - x;
        System.out.println("Age: "+DOB+" Years old");
    }
}
class Employee extends Person{
    private int salary;
    private int experience;


    void set(int x){
        this.experience = x;
    }

    int get(){
        return this.experience;
    }

}
