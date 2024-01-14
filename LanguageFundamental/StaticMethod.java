class Main{

private static int aStaticField;

static void aStaticMethod(){
aStaticField=12;
System.out.println(aStaticField);
}


public static void main(String [] args)
{
   aStaticMethod();

}

}