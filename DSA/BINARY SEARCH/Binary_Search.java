
public class Binary_Search{
    public static void main(String[] args){
        int arr[]={3,4,5,11,22,33,44,55,66,77};
        int target=33;
        int res=Binary_Searching(arr, target);
        if(res==-1){
            System.out.println("The element is not present in the array");
        }
        else{
            System.out.println("The element is found at index: "+res);
        }

    }
    public static int Binary_Searching(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
}