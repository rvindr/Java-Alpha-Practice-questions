// Java program to get a number from the user and print whether it is positive or negative
import java.util.*;
public class Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("The number "+num+" is negative");
        }else{
            System.out.println("The number "+num+" is positive");
        }

    }    
}
