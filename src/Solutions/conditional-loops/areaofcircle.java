import java.util.Scanner;
public class areaofcircle
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius=input.nextDouble();
        if(radius>0){
            double area= 3.14 *radius*radius;
            System.out.println("Area of Circle:"+area);
        }
        else {
            System.out.println("Invalid Radius");
        }
}
}