package Java8.Set1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Set1 {
    public static void main(String[] args) {
        
   List<Integer> numbers=Arrays.asList(1,2,3,45,46,3,44,55,49,555);

  System.out.println(numbers.stream().count());
int sum=numbers.stream().reduce((a,b)->a+b).get();
 System.out.println(sum);

 //transform means map==functional interface
  double avg=numbers.stream().mapToDouble(n->n).average().getAsDouble();

  System.out.println("Average of numbers: "+avg);

  //seperate =filter==condition
  //printing odd

 numbers.stream().filter(n->(n%2!=0)).forEach(n->System.out.println(n));

 //printing numbers start with 4
 List<String> list=numbers.stream().map(n->n.toString()).filter(n->n.startsWith("4")).toList();
   System.out.println(list);

   System.out.println("Ignore First Five Nos");

 List<Integer> list1 = numbers.stream().skip(5).toList();

 System.out.println(list1);

 System.out.println("Printing the Statistics");

DoubleSummaryStatistics statistics =numbers.stream().mapToDouble(n->n).summaryStatistics();

System.out.println(statistics);

System.out.println("Min and Max");

Integer max=numbers.stream().max(Comparator.comparing(n->Integer.valueOf(n))).get();
//or
Integer max1=numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
Integer max2            = numbers.stream().max(Comparator.naturalOrder()).get();   

System.out.println("Max:"+max);
System.out.println("Max1:"+max1);
System.out.println("Max2:"+max2);
//Min

Integer min= numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
//or
Integer min1=numbers.stream().min(Comparable::compareTo).get();
System.out.println("Min:"+min);
System.out.println("Min1:"+min1);

System.out.println("Printing No in Asc or desc order");

List<Integer> listAsc=numbers.stream().sorted(Comparator.naturalOrder()).toList();
System.out.println(listAsc);
System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList());

System.out.println("Second higest Second Lowest");

  Integer secondlowest=numbers.stream().sorted().skip(1).findFirst().get();
 System.out.println("Second Lowest:"+secondlowest);
   Integer secondHigest=   numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
 System.out.println("Second higest: "+secondHigest);
}

}
