import java.util.Scanner;
public class areaofTriangle
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Base:");
        float base=input.nextFloat();
        System.out.println("Enter Height:");
        float height=input.nextFloat();
        if (base!=0 && height!=0)
        {
            float Area=(1.0f/2.0f)*base*height;
            System.out.println("Area of Triangle:"+Area);
        }
        else
        {
            System.out.println("Invalid values");
        }

    }

}