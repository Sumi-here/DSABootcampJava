//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;
public class evenoddmeth{
    static int even(int num){
        if(num%2==0){
            System.out.println("The Number is Even");
        }
        return num;
    }
    static int odd(int num){
        if(num%2 != 0 ){
            System.out.println("The Number is Odd");
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int evenResult=even(num);
        int oddResult=odd(num);
    }
}