class Bank{
    void rateOfIntersts(){
        System.out.println("Generally the bank has the rate of interst is 7%");
    }
}
class SBI extends Bank{
    void rateOfIntersts(){
        System.out.println("Rate of Intersts of SBI is 9%");
    }
}
class PNB extends Bank{
    void rateOfIntersts(){
        System.out.println("Rate of Intersts of PNB is 8%");
    }
}
public class Main{
    public static void main(String[] args) {
        SBI obj=new SBI();
        obj.rateOfIntersts();
        
    }

}