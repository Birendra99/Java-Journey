import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[23];
        try{
            System.out.println("Enter the number to divide:");
            int num=sc.nextInt();
           int res= arr[24]=34/num;
            System.out.println("Results:"+res);

        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
