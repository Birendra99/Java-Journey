interface A{
    public void run();
}
interface B{
    public void run();
}
class C implements A,B{
    public void run(){
        System.out.println("Running In C Class");
    }
}
public class First {

     public static void main(String[] args) {
        C obj=new C();
        obj.run();
     }
}