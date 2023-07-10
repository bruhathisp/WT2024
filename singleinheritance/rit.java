
// Child class inheriting from the rec class
class rit extends rec {
    int b=4;


// Main class

    public static void main(String[] args) {
        // Create an instance of the Car class
        rit o = new rit();

       System.out.println(o.a + o.b);
    }
    
}

// Parent class
class rec {
    int a=3;
}


