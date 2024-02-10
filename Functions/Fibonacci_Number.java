// find a fibonacci number
import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the fibonacci number:");
        int num=sc.nextInt();
        printFibonaciiSeries(num);

    }
    public static void printFibonaciiSeries(int num){
        int first=0;
        int second=1;
        
        for(int i=1; i<=num; i++){
            System.out.print(first+",");
            int sum=first+second;
            first=second;
            second=sum;
        }
    }
}
