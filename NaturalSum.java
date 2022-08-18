// java program for print sum of natural number 
import java.util.*;
public class NaturalSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter number ");
        int num=sc.nextInt();

        int i=1;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println("The sum of natural number 1 to "+num+" is : "+sum);

    }
}
