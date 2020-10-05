public class loopArray {
    public static void main(String[] args){
        int[]  num = {1,2,3,4,5};
        for (int i = 0;i <= 4; i++) {
            System.out.println("At Index "+i+" of the num array variable we have "+num[i]);
            }
        num[4] = 35;
        System.out.println("\nThe value of num at index 4 has been changed to: "+num[4]+"\n");
        System.out.println("So let us run the program again to have our updated values"+"\n");
        for (int i = 0;i <= 4; i++) {
            if(i == 4){
                System.out.println("The updated value of num at index "+i+" is = "+num[i]);
                break;
            }
            System.out.println("At Index "+i+" of the num array variable we have "+num[i]);
        }
    }
}
