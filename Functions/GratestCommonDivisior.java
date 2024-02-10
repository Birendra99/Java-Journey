
// To find the Greatest Common Divisior
import java.util.Scanner;

public class GratestCommonDivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        findGCD(num, num2);

    }

    public static void findGCD(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

        }
        System.out.println(gcd);
    }

}
