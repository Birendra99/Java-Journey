import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the number to divide:");
        int divider=sc.nextInt();
        try{
            int res=num/divider;
            System.out.println("Result:"+res);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide By Zero.");
            System.out.println(e.getMessage());
        }
    }
    
}
