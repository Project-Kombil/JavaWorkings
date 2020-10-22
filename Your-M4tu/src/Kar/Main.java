package Kar;

public class Main {
    public static void main(String[] args){
        Car a = new Car("Black", "Mark");
        Car b = new Car("Glossy Black", "Fuckerati");

        Car c = Car.getInstance();

        a.carCount = 1;
        a.display();

        b.carCount = b.carCount + 1;
        b.display();
        Car.carCount = Car.carCount + 1;

        System.out.println("Number of cars: "+a.carCount);
    }
}
