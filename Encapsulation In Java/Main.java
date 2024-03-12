class Students{
    private String name;
    private int id;
    private int roll;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;

    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getRoll(){
        return roll;
    }
}
public class Main{
    public static void main(String[] args) {
        Students first=new Students();
        first.setName("Biren");
        first.setId(99);
        first.setRoll(9);
        System.out.println("Name: "+first.getName());
        System.out.println("Id "+first.getId());
        System.out.println("Roll No: "+first.getRoll());
        
    }

}