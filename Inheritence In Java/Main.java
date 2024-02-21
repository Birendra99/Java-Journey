class ParentClass{
    void display(){
        System.out.println("Parent Class");
    }
}
class ChildClass extends ParentClass{
    void show(){
        System.out.println("Child Class");
    }
}
public class Main{
     public static void main(String[] args) {
        ChildClass obj=new ChildClass();
        obj.display();
        obj.show();
     }
}