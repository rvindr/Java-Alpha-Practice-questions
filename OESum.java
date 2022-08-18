import java.util.*;


// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
public class OESum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        char choice;
        do{
            System.out.println("Enter your number");
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
            System.out.println("Do you want to continue Press y or n");
            choice = sc.next().charAt(0);
        }while(choice=='y');
        System.out.println("Sum of even numbers :" + evenSum);
        System.out.println("Sum of odd numbers :" + oddSum);
    }

}
