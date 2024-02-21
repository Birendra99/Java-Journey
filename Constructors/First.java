class Student {
    int roll;
    String name;

    Student() {
        System.out.println("Default Constructors.");
    }


    Student(int roll, String name) {
            this.roll=roll;
            this.name=name;
            System.out.println("Parameterised Constructors.");
    }

}

public class First {
    public static void main(String[] args) {
        // In the above Student() is a constructors which appears as a method in the class. 
            Student obj=new Student();

    }
}