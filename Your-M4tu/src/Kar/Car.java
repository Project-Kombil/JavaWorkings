package Kar;

public class Car {
    private String color;
    private String model;

    public static int carCount;

    private static Car singletonObjectOfCar;

    public static Car getInstance(){
        if(singletonObjectOfCar == null) {
            singletonObjectOfCar = new Car("","");
        }
        return singletonObjectOfCar;
    }

    void display(){
        System.out.println("The Car Color is "+color);
        System.out.println("The Car Model is "+model);
    }

    public Car(String color, String model){
        this.color = color;
        this.model = model;
    }
}
