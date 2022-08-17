// check input number is odd or even
import java.util.*;
public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Input number "+num+" is even ");
        }else{
            System.out.println("Input number "+num+" is odd");
        }
    }
}
