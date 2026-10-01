import java.util.Scanner;
public class NameGreet{
    public static void main(String[] args){
        System.out.println("Whats your Name:");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        System.out.println("Hello,"+name+"! Welcome to Lunz tech ");
    }
}
