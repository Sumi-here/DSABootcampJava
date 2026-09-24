//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet
// is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;
public class Pytho{
    static boolean Pythagorean(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (Pythagorean(a, b, c)) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }
}