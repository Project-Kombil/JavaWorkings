public class AbstractionExample {
        public static void main(String[] args){
            Kar c1 = new Kar();
            c1.color = "Red"; // assigning color to the car
            c1.setEngineType("AB"); // invoking a function an object Kar to set the engine
            c1.drive(); //invoking a function of object kar

        }
}

class Kar{
   public String color;
   private String engineType;

    void drive(){
        System.out.println("I am Driving "+color+" Car with Engine of "+engineType);
    }
    public void setEngineType(String c){
        engineType = c;

    }
 }