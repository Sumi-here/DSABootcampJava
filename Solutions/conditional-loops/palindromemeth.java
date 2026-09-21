import java.util.Scanner;
public class palindromemeth {
    static int palindrome(int num){
        int original = num;
        int reverse = 0;
        while(num>0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
            if(original==reverse){
                System.out.println("Its Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        return num;
    }

    public static void main(String[] args) {
        System.out.print("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        palindrome(num);
    }
}