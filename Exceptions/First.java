import java.util.Scanner;
public class First{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            System.out.println("Enter the number you want to divide:");
            int divisor=sc.nextInt();
            int res=num/divisor;
            System.out.println("Result:"+res);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}