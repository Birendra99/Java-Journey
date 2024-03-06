import java.util.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int guess=(int)(Math.random()*100)+1; // Guessing Between 1 to 100
        do{
            System.out.println("Guess The Number:");
            int input=sc.nextInt();
            if(input==guess){
                System.out.println("Great, You guessed the Right.");
                break;
            }
            else if(input>guess){
                System.out.println("Guess the smaller number than previous one number.");
            }
            else{
                System.out.println("Guess the Greater Number than Previous one.");
            }

        }while(true);

    }
}