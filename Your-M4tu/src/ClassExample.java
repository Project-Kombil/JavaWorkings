public class ClassExample {

    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "Red";
        Car c2 = new Car();
        c2.color = "blue";
        System.out.println("The color or Car : c1 is "+c1.color);
        System.out.println("The color or Car : c2 is "+c2.color);
        c1.drive();
    }
}

class Car{
    String  color;
    double mileage;

    void drive(){
        System.out.println("I am Driving a "+color+" car");
    }
}