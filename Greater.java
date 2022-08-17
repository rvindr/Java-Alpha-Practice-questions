// print the largest number from given 2 input 
import java.util.*;
public class Greater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number a :");
        int a=sc.nextInt();

        System.out.println("Enter second Number b :");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("From "+a+ " and "+b+" " + a + " is greater than "+b);
        }else{
            System.out.println("From "+a+ " and "+b+" " + b + " is greater than "+a);
        }
    }
}
