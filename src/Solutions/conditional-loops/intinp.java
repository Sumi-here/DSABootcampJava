import java.util.Scanner;
public class intinp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Sum=0;
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        while (num!=0)
        {
            Sum=num+Sum;
            System.out.print("Enter the number:");
            num=sc.nextInt();
        }
        System.out.println("Sum of all integers="+Sum);

    }
}