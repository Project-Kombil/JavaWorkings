public class Main {
    public static void main  (String[] args){
        Animals animal = new Animals(); //Since the Animals.java file's class is public we can use it
        animal.legCount = 4; // accessing the public variable
        animal.display(); //accessing the public method
    }
}
