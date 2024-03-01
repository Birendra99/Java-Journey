// We can try multiple Catch in the Exceptions 
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        // num[6]=23;
        try{
            num[6]=233/0;
            System.out.println(num[6]/0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
