
// Write and run Java online using this editor.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int temp = n;
        int count=0;
        int original = n;
        int sum=0;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        while(original!=0){
            int digit=original % 10;
            int multiply=1;
            for(int i = 1 ; i <= count; i++){
                multiply *= digit;
            }
            // multiply=Math.pow(digit,count);
            sum += multiply;
            original /= 10;
        }
        System.out.println(sum);
        if(n == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}