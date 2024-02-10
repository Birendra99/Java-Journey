import java.util.Scanner;

/*
 *****
 *****
 *****
 *****
 *****
 */

public class First_Question{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 to print the solid type pattern");
        int num=sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}