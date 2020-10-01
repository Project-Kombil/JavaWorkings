public class ForLoopBreak {
    public static void main(String[] args){
        for(int i = 1; i <= 10; ++i){
            if(i==5){
                break; //jumping out of a loop is the expression is true at one point
            }
            System.out.println(i);
        }
    }
}
