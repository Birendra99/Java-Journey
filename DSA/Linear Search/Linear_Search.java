// Write a program to implement linear search in Java.
public class Linear_Search{
    public static void main(String[] args) {
        int arr[]={2,3,11,1,56,44,33};
        int target=44;
        int res=Searching_Linear(arr, target);
        if(res==-1){
            System.out.println("The element is not present in the array.");
        }
        else{
            System.out.println("The element is found at position "+res);
        }

    }
    public static int Searching_Linear(int[] arr, int target){
        for(int a=0; a<arr.length; a++){
            if(arr[a]==target){
                return a+1;
            }
        }
        return -1;
    }

}
