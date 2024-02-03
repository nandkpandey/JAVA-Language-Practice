package Problems;

import java.util.Stack;

public class DecimalToBinaryConversion {
  
  public static String decimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        // ToDo: Write Your Code Here.
        
        Stack<Integer> stack=new Stack<>();
        while(num!=0){

           int remainder=num%2;
           num=num/2;
            stack.push(remainder);
        }
        while(!stack.isEmpty())
        {
            int no=stack.pop();
            sb.append(no);
        }
        
        
        return sb.toString();
    }
  
    public static void main(String[] args) {

        System.out.println(decimalToBinary(2));

    }
}
