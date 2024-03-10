interface X{

    int a=10; 
    void show(); // here the methods is public by defaults.
}
interface Y{
    void run();
}
class Z implements X,Y{
    public void show(){
        System.out.println("Showing");
        System.out.println("A: "+a);
    }
    public void run(){
        System.out.println("Running");
        System.out.println("A: "+a);
    }
}


public class Main{
    public static void main(String[] args) {
        // X obj1=new X(); we cannot create the objects of interface.
        Z obj=new Z();
        obj.show();
        obj.run();
        
    }
}