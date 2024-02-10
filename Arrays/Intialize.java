import java.util.Scanner;

public class Intialize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arrays=new int[5];
        System.out.println("Enter the number:");
        for(int i=0; i<5; i++){
            arrays[i]=sc.nextInt();
        }
        System.out.print("The Entered Number is:");
        for(int i=0; i<5; i++){
            System.out.print(arrays[i]+",");
        }

    }
}
