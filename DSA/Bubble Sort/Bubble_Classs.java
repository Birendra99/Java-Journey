public class Bubble_Classs {
    public void printElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={45,33,22,67,89,11,23};
        Bubble_Classs b1=new Bubble_Classs();
        System.out.print("Before Sorting the Elements are: ");
        b1.printElements(arr);
        b1.bubbleSort(arr);
        System.out.println();
        System.out.print("After Sorting the elements by Using Bubble Sort: ");
        b1.printElements(arr);


    }
}
