public class StaticDemo{
  static int a=4;

static void print(){
//can not access " this" here
        a=5;
    System.out.println("Static method");
}

public static void main(String[] args) {

    
    print();
}


}