
class Vehicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println("Price: "+price);
        System.out.println("Mileage: "+mileage);
        System.out.println("Color: "+color);
    }
}
class Car extends Vehicle{
    String ftype;
    boolean sunproof;
    String brand;
}
public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.brand="Tata";
        car1.price=150000;
        car1.mileage=18.8;
        car1.ftype="Diesel";
        car1.color="Aque";
        car1.sunproof=true;
        System.out.println("Brand: "+car1.brand);
        car1.display();
        System.out.println(car1.sunproof);
    }
}
