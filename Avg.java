import java.util.*;
// Question1:In a program , input 3 numbers : A , B and C.You have to output the average of these 3 numbers

public class Avg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();

        System.out.println("Enter second number");
        int num2=sc.nextInt();

        System.out.println("Enter third number");
        int num3=sc.nextInt();

        int avg = (num1+num2+num3)/3;
        System.out.println("The average of given input is : "+ avg);
    }
}