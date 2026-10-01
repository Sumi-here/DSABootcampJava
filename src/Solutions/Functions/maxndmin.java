import java.util.Scanner;
public class maxndmin {
    static int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int smallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter first num:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second num:");
        int b = sc.nextInt();
        System.out.println("Enter third num:");
        int c = sc.nextInt();
        int largest = largest(a, b, c);
        int smallest = smallest(a, b, c);
        System.out.println("Largest of three numbers is:" + largest);
        System.out.println("Smallest of three numbers is:" + smallest);
    }
}


