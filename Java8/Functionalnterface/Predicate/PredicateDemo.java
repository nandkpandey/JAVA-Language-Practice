package Java8.Functionalnterface.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
 
    
public static void main(String[] args) {
    

Predicate<String> p=(str)->{return str.length()>2;};

System.out.println(p.test("ABC"));

Predicate<String> p2=(str)->{return str.equals("ABC");};

System.out.println(p2.test("abc"));

//and ==> p.test() && p2.test()


System.out.println(p.and(p2).test("ABC")); // p.test("ABC")=true && p2.test("ABC")=true  ==true

System.out.println(p.or(p2).test("abc")); // p.test("abc")=true && p2.test("abc")=false  ==true


System.out.println(p.negate().test("A"));//p.test("A")=false result true


BiPredicate<String,String> bi=(str1,str2)->{return str1.equals(str2);};

System.out.println(bi.test("A", "a"));


}


}
