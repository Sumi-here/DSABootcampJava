import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("Enter b:");
        int b= input.nextInt();
        System.out.println("Enter the operator:");
        char operator= input.next().charAt(0);
        if ( operator=='+' ) {
            int c= a+b;
            System.out.println("Ans:"+c);
        } else if (operator=='-') {
            int c=a-b;
            System.out.println("Ans:"+c);
        } else if (operator=='*') {
            int c=a*b;
            System.out.println("Ans:"+c);
        } else if (operator=='%') {
            int c=a%b;
            System.out.println("Ans:"+c);
        }else {
            System.out.println("Invalid Operator");
        }

    }
}