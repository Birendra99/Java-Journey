public class Single_Inheritence {
    public static void main(String[] args) {
        Son first=new Son("Ram",34);
        first.printInfo();
    }
}
class Father{
     String fname="Hari";
    String City="Tikapur";

}
class Son extends Father{
    String name;
    int age;
    
    Son(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Father Name: "+this.fname);
        System.out.println("City: "+this.City);
    }

}
