import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class InterfaceDemo
{


public static void main(String[] args) {
    

     Consumer<String> c=(str)->{System.out.println(str.toUpperCase());};

     c.accept("nand");


     BiConsumer<String,String> bi=(str1,str2)->{System.out.println(str1.concat(str2));};



     bi.accept("Nand", "Pandey");



     Consumer<String> c2=(str)->{System.out.println(str.length());};

     
     //Chanining 
     c.andThen(c2).accept("Kishor");

}


}