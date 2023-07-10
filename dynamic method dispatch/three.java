// Parent class
interface one {
    void play();
}

// Child class inheriting from Animal
public class two implements one {
    
    public void play() {
        System.out.println(3+5);
    }
}

// Another child class inheriting from Animal
class three implements one {
     public void play() {
        System.out.println(5-3);
    }
    
    
    public static void main(String[] args) {
        
        
        three o = new three();
        o.play();
    }
}

    
        