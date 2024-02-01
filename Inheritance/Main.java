package Inheritance;


public class Main {

    public static void main(String[] args) {
        
  //   new B();

  /*In Java, when you create an instance of a subclass (in your case, B), the constructors of the
   superclass (or parent class, A in this case) are called before the constructor of the subclass.
    This is because the subclass inherits from the superclass and must ensure that the superclass is
     properly initialized before the subclass begins its own initialization. */
  new B(1);
    }

}
