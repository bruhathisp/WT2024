public class mol {
    
     public void add(int num1) {
        System.out.println( num1 );
    }
    public void add(int num1, int num2) {
        System.out.println( num1 + num2);
    }

     public void add(int num1, int num2, int num3) {
        System.out.println( num1 + num2 + num3);
    }
    


    public static void main(String[] args) {
        mol o = new mol();

        o.add(3);
        o.add(3,5);
        o.add(3,5,7);
    }
}
