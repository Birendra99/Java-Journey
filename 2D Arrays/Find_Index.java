// find index in 2D arrays
import java.util.Scanner;
public class Find_Index {
    public static void main(String[] args) {
        int[][] numbers={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("The 2D arrays is given below:");
        for(int a=0; a<numbers.length; a++){
            for(int b=0; b<numbers.length; b++){
                System.out.print(numbers[a][b]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number to find at which index the number is lies:");
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        boolean isFound=false;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[i][j]==find){
                    System.out.println("The number is found at index:("+i+","+j+")");
                    isFound=true;
                }

            }
        }
        if(!isFound){
            System.out.println("The number is not found in the 2D arrays.");
        }
    }
}
