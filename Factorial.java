// Java program to find Factorial of a number 
import java.util.*;
public class Factorial {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of " + num +" is "+ fact);
    }
}
