// Write a program to implement insertion sort in Java.
public class Insertion_Search{
    public static void main(String[] args) {
        
    }
    public static void Insert(int[] arr){
        int len=arr.length;
        for(int a=1; a<len; a++){
            int temp=arr[a];
            int b=a-1;
            while (a>=0 && arr[b]>temp ) {
                arr[b+1]=arr[b];
                a--;
            }
            arr[b+1]=temp;

        }
        

    }
}