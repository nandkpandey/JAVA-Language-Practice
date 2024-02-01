package Inheritance;

public class B extends A{

    public int b;
    
        
      public   B(){
            System.out.println("B:In Child Class Constructor");
        }
    public B(int b){
        // Implicit call to super(); happens here
        this.b = b; // Your code starts executing after the superclass constructor finishes
    } 
    

    
    }
    
    