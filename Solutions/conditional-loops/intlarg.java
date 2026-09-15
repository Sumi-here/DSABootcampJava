import java.util.Scanner;
public class intlarg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int largest = num;
        while (num != 0) {
            if (num > largest) {
                largest = num;
            }
            System.out.print("Enter the number: ");
            num = sc.nextInt();
        }
        System.out.println("Largest number = " + largest);
    }
}