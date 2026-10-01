//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class votemeth{
    static int eligible(int age){
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        return age;
    }
    static int not_eligible(int age){
        if(age<18){
            System.out.println("Not Eligible");
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
        not_eligible(age);
    }
}
