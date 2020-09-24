public class flowOfControl { //Using  the if in Flow of Control to skip a statement and move on to the next statement
    public static void main(String[] args){
        int a = 4;
        if(a==3 && 5>4){
            System.out.println("Ais 3");
            a=a+5;
        } //Because the statement is false the whole BLOCK in the curly braces will be disregarded
        a=a+2;
                System.out.println(a);
    }
}
