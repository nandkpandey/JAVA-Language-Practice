public class ArrayDemo2 {
   
    

    public static void main(String[] args) {
        
   int [][] arr=new int[][]{{1,2,3},{4,5,6}};

   for(int i=0;i<arr.length;i++){

    for(int j=0;j<arr[i].length;j++)
    {
        System.out.print(arr[i][j]);
    }
    System.out.println();
   }

   //By For Each Loop 
for (int[] is : arr) {
    
    for (int is2 : is) {
        
        System.out.print(is2);
    }
System.out.println();
}


System.out.println("Ragged Array======================================");

int arrR[][]=new int [][]{
    {10,12},
    {23,45,67},
    {34,45,56,68}
};


for (int[] is : arrR) {
    
    for (int is2 : is) {
    System.out.print(is2+" ");    
    }
    System.out.println();
}


    }
}
