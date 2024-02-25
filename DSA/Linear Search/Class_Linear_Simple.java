// Write a program to implement linear search in Java using the Class and Constructors Concept.
public class Class_Linear_Simple{
    private int[] array;
    
    Class_Linear_Simple(int[] arr){
         this.array=arr;
    }
    public int Linear_Search(int target){
        for(int a=0; a<array.length; a++){
            
            if(array[a]==target){
                return a;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,34,1,4,5,6,88,99,45,53};
        int target=53;
        Linear_Search_class obj=new Linear_Search_class(arr);
        int res=obj.Linear_Search(target);
        
        if(res==-1){
            System.out.println("The element is not present in the given Array.");
        }
        else{
            System.out.println("The element is found at index :"+res);
        }


    }
}
