// Question2:In a program,input the side of a square.You have to output the area of the square.
import java.util.*;
public class SquareArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square :");

        float side =sc.nextFloat();
        float area = side * side;

        System.out.println("The area of square is :" + area);
    }

}
