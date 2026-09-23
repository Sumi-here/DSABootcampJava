import java.util.Scanner;
public class prime {

    static void Primes(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Prime numbers:");
        Primes(start, end);
    }
}