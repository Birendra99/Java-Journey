//Calculate Area of a Circle
import java.util.Scanner;
public class Circle_Area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        float rad=sc.nextFloat();
        System.out.println(calculateArea(rad));
    }
    public static float calculateArea(float radius){
        float pi=3.14f;
        float Area= (pi*radius*radius);


        return Area;
    }
}