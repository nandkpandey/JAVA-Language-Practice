package Problems;

public class DistanceBetweenColsetestElement {

    

public static int minDistanceBetweenClosestElement(int [] arr){

int n=arr.length;

int dMin=Integer.MAX_VALUE;//MaxInt  

for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
dMin=Math.min(dMin,Math.abs(arr[i]-arr[j]));

    }
}
return dMin;

}


public static void main(String[] args) {
    
int [] arr={9,1,2,3,16};

int d=minDistanceBetweenClosestElement(arr);

System.out.println("Distance:"+d);

}





}