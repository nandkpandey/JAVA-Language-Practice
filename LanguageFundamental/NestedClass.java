public class NestedClass {
    
private int num1=0;
int num4=new Inner().num3+1;

class Inner{
  private int num5=num1;
    private int num3=40;

    static  int num6=67;
}



public static void main(String[] args) {
   
   NestedClass obj=new NestedClass();
   
    System.out.println(obj.num4);
}

}
