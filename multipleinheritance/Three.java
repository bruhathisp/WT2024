// Parent class
 class One {
    int a=2;
}

// Child class inheriting from class One
 class Two extends One {
    int b=3;
}

// Grandchild class inheriting from class Two
public class Three extends Two {
    int c=4;
    
    public static void main(String[] args) {
        
        Three o = new Three();
        System.out.println(o.a +o.b +o.c);
   
   
    } 
}


