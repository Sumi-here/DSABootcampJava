import java.util.Scanner;
public class Depriciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original value: ");
        double value = sc.nextDouble();
        System.out.print("Enter depreciation rate: ");
        double rate = sc.nextDouble();
        double depreciation = value * rate / 100;
        double finalValue = value - depreciation;
        System.out.println("Depreciation = " + depreciation);
        System.out.println("Final Value = " + finalValue);
    }
}