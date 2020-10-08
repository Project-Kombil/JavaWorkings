public class ParameterizedCon {
    public static void main(String[] args){
        Vehicle2 v1 = new Vehicle2(4); //Providing the input to the variable a of data type int
        v1.display();
        Vehicle2 v2 = new Vehicle2(2);
        v2.display();
    }
}

class Vehicle2{
    public int wheels;

    public Vehicle2(int a){ //can take up multiple variables
        wheels = a; //The input is assigned to this variable
        System.out.println("The Constructor is on the run......");

    }

    public void display(){
        System.out.println("Number of wheels "+wheels);
    }
}
