import java.util.Scanner;
public class Currency{
    public static void main(String[] args){
        System.out.println("Enter amount");
        Scanner sc=new Scanner(System.in);
        Float rupees=sc.nextFloat();
        Float exchange_rate=95.38f;
        Float USD=rupees/exchange_rate;
        System.out.println("Amount in USD:" + "$" + USD);
    }
}