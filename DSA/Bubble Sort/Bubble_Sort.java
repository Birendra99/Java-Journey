

public class Bubble_Sort{
    public static void main(String[] args) {
        int arr[]={34,22,11,45,20,55,89};
        System.out.print("Before Sorting: The elements are: ");
        for(int a=0; a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }
        
        for(int a=0; a<arr.length; a++){
            for(int b=a+1; b<arr.length; b++){
                if(arr[a]>arr[b]){
                    int temp=arr[a];
                    arr[a]=arr[b];
                    arr[b]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("After Sorting by Using the Bubble sort: ");
        for(int a=0; a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }

    
     
    }
}