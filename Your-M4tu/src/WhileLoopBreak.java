public class WhileLoopBreak {
    public static void main(String[] args){
        int num = 10;
        int sum = 0;
        while(num == 10){
            if(num < 0){
                break;
            }
            sum += num;
        }
        System.out.println();
    }
}
