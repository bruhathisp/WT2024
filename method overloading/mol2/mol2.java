public class mol {
    
     public void add(int num1, int num2) {
        System.out.println( num1 );
    }
    public void add(float num1, float num2) {
        System.out.println( num1 + num2);
    }

     public void add(double num1, double num2) {
        System.out.println( num1 + num2 );
    }
    

    


    public static void main(String[] args) {
        mol o = new mol();

        o.add(3,5);
        o.add(3.5,5.5);
        o.add(363636363,573737373);
    }
}
