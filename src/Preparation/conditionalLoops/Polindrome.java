package Preparation.conditionalLoops;

import java.util.Scanner;

public class Polindrome {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;
        int reversed = 0;
        while(temp != 0){
            int digit = temp % 10;
            reversed = (reversed * 10) + digit;
            temp /= 10;
        }
        if(num == reversed){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
