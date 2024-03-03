class A{
    void print(){
        System.out.print("Calling Class A");
    }
}
class B extends A{
    void printB(){
        print();
        System.out.print(" From Class B");
    }
}
class C extends A{
    void printC(){
        print();
        System.out.print(" From Class C");
    }
}


public class Main{
    public static void main(String[] args) {
        B obj=new B();;
        // obj.print();
        obj.printB();
        System.out.println();
        C obj1=new C();
        // obj1.print();
        obj1.printC();
        
    }
}