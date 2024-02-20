// In java Function is a standalone procedure, while a method is a function associated with an object or class.

import java.util.Scanner;

public class Second {
    String name;
    int roll;
    public void printInfo(){
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll);

    }
    public static void main(String[] args) {
        Second obj=new Second();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        obj.name=sc.next();
        System.out.println("Enter the roll number:");
        obj.roll=sc.nextInt();
        obj.printInfo();
    }
}
