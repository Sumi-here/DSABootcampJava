/*Write a program to print the circumference and area of a circle of radius entered by user by
defining your own method.*/
import java.util.Scanner;
public class Circumndarea{
    static void Area(int r){
        float AreaCir=3.14f * r * r;
        System.out.println("Area of circle is:"+AreaCir);

    }
    static void circum(int r){
        float CircumCir=2*3.14f*r;
        System.out.println("Circumference of circle is:"+CircumCir);

    }

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r=sc.nextInt();
        Area(r);
        circum(r);
    }

}

