// Enter cost of 3 items from the user (usingfloatdatatype) - a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
import java.util.*;
public class Cost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Price of Pen");
        float pen =sc.nextFloat();

        System.out.println("Enter Price of Pencil");
        float pencil =sc.nextFloat();
        
        System.out.println("Enter Price of Eraser");
        float eraser =sc.nextFloat();

        float total_cost = pen+pencil+eraser;

        float bill = (total_cost * 0.18F) + total_cost;

        System.out.println("Your total cost of items is  : "+ total_cost);
        System.out.println("Total Bill with 18% GST : "+ bill);

    }
}
