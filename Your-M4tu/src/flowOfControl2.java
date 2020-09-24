public class flowOfControl2 { //Using  the if and else in Flow of Control to skip a statement and move on to the next statement
    public static void main(String[] args){
        int k = 4;
        if(k==2){ //if the statement is false, the following line will be prioritized
            System.out.println("K is 2");
        } else {
            System.out.println("K is not 2");
                    k=k+5;
        }
        k++;
        System.out.println("K is "+k);
    }
}
