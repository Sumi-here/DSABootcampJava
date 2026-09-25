import java.util.Scanner;
public class BattingAverage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter runs scored: ");
        int runs=sc.nextInt();
        System.out.print("Enter number of dismissals: ");
        int dismissals=sc.nextInt();
        double average=(double)runs/dismissals;
        System.out.println("Batting Average = "+average);
    }
}