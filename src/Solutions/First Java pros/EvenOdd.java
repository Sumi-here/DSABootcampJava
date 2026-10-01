import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
        {
            System.out.println("Enter a number");
            Scanner input =new Scanner (System.in);
            int num=input.nextInt();
            if(num%2==0){
                System.out.println("The entered number is even");
                }
            else{
                System.out.println("The entered number is odd");
                }
        }
}