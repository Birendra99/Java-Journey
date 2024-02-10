// Calculate the factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of a number");
        int number=sc.nextInt();
        System.out.println("The factorial of a given number is "+findFactorial(number));

    }
    public static int findFactorial(int num){
        int fact=1;
        for(int a=1; a<=num; a++){
            fact=fact*a;
        }
        return fact;
    }
}
