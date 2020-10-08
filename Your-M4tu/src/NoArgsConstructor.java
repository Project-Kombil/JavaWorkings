public class NoArgsConstructor {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        v1.display();
        Vehicle v2 = new Vehicle();
        v2.display();
    }
}

class Vehicle{
    public int wheels;

    public Vehicle(){
        wheels = 2;
        System.out.println("The Constructor is on the run......");

    }

    public void display(){
        System.out.println("Number of wheels "+wheels);
    }
}
