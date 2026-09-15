import java.util.Scanner;
public class Factor
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number to get the factorial:");
        Scanner sc=new Scanner(System.in);
        int factorial=sc.nextInt();
        int i=0;
        for (i=0;i<=20;i++)
        {
            int ans=factorial*i;
            System.out.println(factorial+"*"+i+"="+ans) ;
        }
    }
}