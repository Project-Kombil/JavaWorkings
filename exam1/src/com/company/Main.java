package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Checking a Palindrome.");
        System.out.println("Enter any Number: ");
        Scanner Enter = new Scanner(System.in);
        int num = Enter.nextInt();
        int exam = num;
        int val = 0;
        while( num > 0) { //condition
            int d = num % 10; //remainder
            val = val * 10 + d;
            num = num / 10; //update for the loop
        }
        if(val==exam){
            System.out.println("Entered Number "+exam+" is a palindrome");
        } else {
            System.out.println("Entered number "+exam+" is not a palindrome");
        }
    }
}
