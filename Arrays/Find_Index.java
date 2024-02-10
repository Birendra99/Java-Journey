// Find out the number is present in arrays or not
// Find at which index
import java.util.Scanner;
public class Find_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int size=sc.nextInt();
        int[] arrays=new int[size];
        System.out.println("Enter the number to stored in a array");
        for(int i=0; i<arrays.length; i++){
            arrays[i]=sc.nextInt();
        }
        System.out.println("Enter the number to find:");
        int find=sc.nextInt();
        boolean isFound=true;

        for(int a=0; a<arrays.length; a++){
            if(arrays[a]==find){
                System.out.println("The number is found at index "+arrays[a]);
                isFound=true;
                   }
             }
             if(isFound==false){
                System.out.println("The number is not found in arrays.");
             }

            
    }
}
