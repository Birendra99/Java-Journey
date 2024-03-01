import java.util.Scanner;

import javax.management.RuntimeErrorException;
public class Fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age<18){
            throw new RuntimeErrorException(null,"You are not eligible for voting.");
        }
        else{
            System.out.println("You are eligible.");
        }
    }
}
