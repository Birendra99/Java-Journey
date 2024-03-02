// To invoke a parent class Fields(Variables).
class Animal{
    String name="Friendly";
}
class Dog extends Animal{
    String name="Sharukh";
    void printName(){
        System.out.println("Dog Name:"+this.name);
        System.out.println("Type: "+super.name);
    }
}

public class First{

    public static void main(String[] args) {
        Dog first=new Dog();
        first.printName();
        
    }
}