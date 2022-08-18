// square pattern 
import java.util.*;
public class SquarePattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many lines of sqaure pattern you want :");
        int line= sc.nextInt();

        for(int i=1;i<=line;i++){
            for(int j=1;j<=line;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
