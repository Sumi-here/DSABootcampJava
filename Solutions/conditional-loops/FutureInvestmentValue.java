import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double pv = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int n = sc.nextInt();
        double fv = pv * Math.pow((1 + r / 100), n);
        System.out.println("Future Investment Value = " + fv);
    }
}