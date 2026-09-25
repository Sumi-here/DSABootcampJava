import java.util.Scanner;
public class Commission{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales=sc.nextDouble();
        System.out.print("Enter commission percentage: ");
        double percentage=sc.nextDouble();
        double commission=sales*percentage/100;
        System.out.println("Commission = "+commission);
    }
}