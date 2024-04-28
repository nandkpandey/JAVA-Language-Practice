package InterviewProblem;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {

	
	public static void main(String[] args) {

		
		Map<String,List<String>> map=new HashMap<>();
		
		List<String> list1=new ArrayList<>();
		list1.add("Nanda");
		list1.add("Kishor");
		list1.add("Pandey");
		
		List<String> list2=new ArrayList<>();
		list2.add("Lucknow");
		list2.add("UP");
		list2.add("India");
		List<String> list3=new ArrayList<>();
		list3.add("Software");
		list3.add("Engineer");
		list3.add("Java");
		
		map.put("A", list1);
		map.put("B", list2);
		map.put("C", list3);
		
		//List<>=list1.stream().filter(c->c.endsWith("a")).collect(Collectors.toList());
		List<String> result=new ArrayList<>();
	  for(Map.Entry<String,List<String>> mapObj:map.entrySet())
	  {
		   List<String> listObj=mapObj.getValue();
	  for(String str:listObj)
	  {
		  if(str.endsWith("a"))
			  result.add(str);
	  }
	  
	  }
	  
	  System.out.println(result);
	  
	  List<String> result2=map.values().stream().flatMap(List::stream).filter(s->s.endsWith("a")).collect(Collectors.toList());
	  
	  System.out.println(result2);
	  
		
	}
}
