package Preparation.conditionalLoops;
//Vowels or consonants
import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Vowels {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter letter:" ) ;
            char w = toLowerCase(sc.next().charAt(0));
            if (w == 'a'||w == 'e'||w == 'i'||w == 'o'||w =='u'){
                System.out.println("Vowels");
            }
            else{
                System.out.println("Consonents");
            }
        }
    }
