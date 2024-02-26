public class Min_Element {
    public static void main(String[] args) {
        int[] arr={23,2,3,1,45,55,66,77};
        int res=minimumElement(arr);
        System.out.println("The minimum element is: "+res);

    }
    public static int minimumElement(int[] arr){
        int min=arr[0];
        for(int a=1; a<arr.length; a++){
            if(min>arr[a]){
                min=arr[a];
            }
        }

        return min;
    }
}
