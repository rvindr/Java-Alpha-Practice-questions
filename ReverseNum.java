// print inverse of input number
import java.util.*; 
public class ReverseNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num= sc.nextInt();

        while(num>0){
            int lastDigit =num%10;
            System.out.print(lastDigit);

             num/=10;

        }
    }
}
