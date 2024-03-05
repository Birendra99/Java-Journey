class A {
   
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b,int c, double d){
        return a+b;
    }
    
}

public class Main {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println("The sum of two number is "+obj.sum(2,3));
        System.out.println("The sum of three number is "+obj.sum(4,5,6));

    }
}
