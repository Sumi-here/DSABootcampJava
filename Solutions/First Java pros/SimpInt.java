import java.util.Scanner;
public class SimpInt
{
    public static void main(String[] args)
    {
     System.out.println("Enter values of:");
     System.out.println("-Principal:");
     Scanner input=new Scanner(System.in);
     Float P = input.nextFloat();
     System.out.println("-Time:");
     Float T = input.nextFloat();
     System.out.println("-Rate:");
     Float R = input.nextFloat();
     System.out.println("Simple Interest = ");
     Float SI=(P*T*R)/100 ;
     System.out.println(SI);
    }
}