public class Animal {
    protected void display(){
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal{ //extend is the keyword to have some properties inherited from the another class, thus becoming the child and that class the parent
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.display(); //calling the display function in Animal Class
    }
}
