/*Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of
positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the
user enters a zero.*/

import java.util.Scanner;
public class posneg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        int poseven=0;
        int posodd=0;
        int negati=0;
        while(n!=0) {
            System.out.println("Enter the number:");
            n = sc.nextInt();
            if (n > 0 && n % 2 == 0) {
                poseven = poseven + n;
            } else if (n > 0 && (n & 2) != 0) {
                posodd = posodd + n;
            } else if (n < 0) {
                negati = negati + n;
            }
        }
        System.out.println("Sum of even positive numbers is:" + poseven);
        System.out.println("Sum of odd positive numbers is:" + posodd);
        System.out.println("Sum of negative numbers is:" + negati);


    }
}
