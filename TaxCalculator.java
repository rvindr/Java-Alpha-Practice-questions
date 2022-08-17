// income tax calculator 
/*
    income<5L 0%;
    income between 5L-10L ==> 20%;
    income> 10L ==> 30%;

 */
import java.util.*;

import javax.lang.model.util.ElementFilter;
public class TaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income :");

        int ic =sc.nextInt();

        if(ic<500000){
            System.out.println("Your income is less than 5Lakh so you don't have to pay tax");
        }
        else if(ic>500000 || ic<=1000000) {
            int tax =(int)( ic * 0.2);
            System.out.println("You have to pay "+tax+"rs tax");
        }
        else if(ic>1000000){
            int tax = (int)( ic * 0.3);
            System.out.println("You have to pay "+tax+"rs tax");
        }
        else{
            System.out.println("Something wrong happens please try Again!");
        }

    }
}
