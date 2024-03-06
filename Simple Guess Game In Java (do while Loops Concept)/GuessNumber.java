import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int guess=(int)(Math.random()*1000)+1;
        int noOfGuess=10;
        do{
            System.out.println("Enter the number:");
            int input=sc.nextInt();
            if(input==guess){
                System.out.println("Great,You gueesed Right.");
                break;
            }
            if(--noOfGuess==0){
                System.out.println("Oops, You loose the game.");
                break;
            }
            if(input>guess){
                System.out.println("Guess the Smaller than previos one number");
            }
            else{
                System.out.println("Guess the Greater number than previous number");
            }
        }while(true);
    }
    
}
