public class DefaultConstruct {

    public static void main(String[] args){
        Vehicle1 v1 = new Vehicle1();
        v1.display();
    }
}

class Vehicle1{
    public int wheels; //The Compiler has default values for each data type therefore when no value is given the default is shown hence we have 0



    public void display(){
        System.out.println("Number of wheels "+wheels);
    }
}
