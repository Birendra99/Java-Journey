abstract class Car{
    abstract void fuelType();
    public void printBrand(){
        System.out.println("A1");
    }

}
class Toyota extends Car{
    public void fuelType(){
        System.out.println("Diesel");
    }
}
public class Main{
    public static void main(String[] args) {
        Toyota obj=new Toyota();
        obj.fuelType();
        obj.printBrand();
        
    }
}