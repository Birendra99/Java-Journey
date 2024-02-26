public class Maxi_Element{
    public static void main(String[] args) {
        int[] arr={2,34,55,1,88,99,45};
        int res=max_search(arr);
        System.out.println("The maximum element is :"+res);


    }
    public static int max_search(int arr[]){
         
        int max=arr[0];
        for(int a=1; a<arr.length; a++){
            if(max<arr[a]){
                max=arr[a];

            }
        }
        return max;
    }
}