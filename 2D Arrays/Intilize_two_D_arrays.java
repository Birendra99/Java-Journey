// Intialize the two D arrays
import java.util.Scanner;
public class Intilize_two_D_arrays{
    public static void main(String[] args) {
        // int[][] numbers=new int[2][3];
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows:");
         int rows=sc.nextInt();
         System.out.println("Enter the number of columns:");
         int cols=sc.nextInt();

         int[][] arrays=new int[rows][cols];
        System.out.println("Enter the number to stored in the 2D arrays :");
        for(int a=0; a<rows; a++){
            for(int b=0; b<cols; b++){
                arrays[a][b]=sc.nextInt();

            }
        }
        System.out.println("The 2D arrays is given below:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }

    }
}