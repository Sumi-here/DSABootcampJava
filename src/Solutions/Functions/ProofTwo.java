//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;
public class ProofTwo {
    static int Product(int a,int b){
        int Prooduct =a*b;
        System.out.println("Product:"+Prooduct);
        return Prooduct;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        Product(a,b);
    }

}
