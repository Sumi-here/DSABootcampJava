package conditionals_loops;

// Armstrong number

import java.util.Scanner;

public  class Armstrongg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;
        int original = num;
        int count = 0;

        while (temp != 0){
            count = count + 1;
            temp = temp / 10;
        }
        System.out.println(count);
        while (original != 0){
            int digit = original % 10;
            int multiply = 1;
            for (int i = 1; i <= count ; i++) {
                multiply = multiply * digit;
            }
//            double multiply = Math.pow(digit,count);
            sum = sum + multiply;
            original = original / 10;
        }
        if(num == sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}