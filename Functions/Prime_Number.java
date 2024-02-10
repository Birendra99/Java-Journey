// Calculate the prime number
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check the whether the is prime or not:");
        int num=sc.nextInt();
        findPrimeNumber(num);
    }
    public static void findPrimeNumber(int num){
          int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("The given number is prime number which is "+num);
        }
        else{
            System.out.println("The given number is not prime number.");
        }

    }
}
