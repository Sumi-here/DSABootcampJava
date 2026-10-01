//Running Sum of 1d Array
import java.util.Scanner;
public class OneDArray {
    public static void main(String[]args){
        int[]arr1={1,3,5,2,7};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
            System.out.print(sum+" ");
        }
    }
}
