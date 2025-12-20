import java.util.HashMap;
import java.util.Map;

public class CountSubArraywithEqual0and1 {

public static int countSubArraywithEqual0and1(int []arr,int N)
{

int count=0;
int sum=0;

Map<Integer,Integer> map=new HashMap<>();

map.put(0, 1);
for(int i=0;i<arr.length;i++){

if(arr[i]==0)
{
    sum+=-1;
}
else{sum+=1;}



if(map.containsKey(sum))
{
    count+=map.get(sum);
    map.put(sum,map.get(sum)+1);
}
else{
    map.put(sum,1);
}
}
return count;
}


public static void main(String[] args) {
    
int arr[]={1,0,0,1,0,1,1};



int answer=countSubArraywithEqual0and1(arr, 7);
System.out.println(answer);

}


    
}




