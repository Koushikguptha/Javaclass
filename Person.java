import java.util.Scanner;
import java.util.*;
public class Person {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        else if (age <18 ){
            System.out.println("Not eligible to vote");
        }
            else {
            System.out.println("Your not eligible to vote");
        }

        
       
    }
}
