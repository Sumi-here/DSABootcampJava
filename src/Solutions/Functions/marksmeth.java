//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.

import java.util.Scanner;
public class marksmeth{
    static int Factorial(int num){
        int a=1;
        for(int i=1;i<=num;i++){
            a=a*i;
        }
        System.out.println("Factorial of"+num+"is:"+a);
        return a;
    }

    public static void main(String[] args) {
        System.out.print("Enter number for which u want the Factorial:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Factorial(num);
    }
}