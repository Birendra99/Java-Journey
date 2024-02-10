public class Next_String {
    public static void main(String[] args) {
        // String[][] names=new String[3][3];
        String[][] names={
            {"Ram","Sam","Hari"},
            {"Rita","Sita","Gita"},
            {"Harilal","Biren","Devil"}
        };
        System.out.println("The names in 2D arrays is given below");
        for(int a=0; a<names.length; a++){
            for(int b=0; b<names.length; b++){
                System.out.print(names[a][b]+" ");
            }
            System.out.println();
        }
       

    }
}
