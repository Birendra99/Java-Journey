class Student{
    String name;
    int roll;
    double marks;
    Student(String nam, int roll){
        this.name=nam;
        this.roll=roll;
        printInfo();

    }
    Student(String name, int roll, double marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
        fullPrintInfo();
    }
    public void printInfo(){
        System.out.println("Name:"+name);
        System.out.println("Roll No:"+roll);
        System.out.println();
        System.out.println();
    }
    public void fullPrintInfo(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
        System.out.println("Marks: "+marks);
    }
}

public class Second {
    public static void main(String[] args) {
        Student obj=new Student("Ram", 23);
        Student obj1=new Student("Biren", 90, 77);
    }
}
