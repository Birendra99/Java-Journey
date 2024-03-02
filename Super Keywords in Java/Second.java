// To Invoke a parent class Methods 
// Remeber When ever we invoking its gives proiority to its class than ohters like father class or supers class also.
// No matter what it will always give prorities to its class then others.
class Animal{

   void isEat(){
    System.out.println("Eating.");
   }
}
class Dog extends Animal{

    void isEatingBread(){
        System.out.println("Eating Bread.");
    }
    void details(){
        isEatingBread();
        isEat();
    }
}
public class Second {
    public static void main(String[] args) {
        Dog fir=new Dog();
        fir.details();
    }
    
}
