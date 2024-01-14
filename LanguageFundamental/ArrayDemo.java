public class ArrayDemo {
  
    


public static void main(String[] args) {
    
    int [] arr=new int [5];
int []arri={1,2,3,4,5};

for(int a:arri){
    System.out.println(a);
}

int [][] twoD=new int [2][3];

for(int i=0;i<twoD.length;i++){

    for(int j=0;j<twoD[i].length;j++){

        System.out.println(twoD[i][j]);
    }
}
System.out.println("===========================");
//Ragged Array
 int [][]arrR=new int [2][];
 arrR[0]=new int [1];
 arrR[1]=new int [2];
 for(int k=0;k<arrR.length;k++)
 {
    for(int j=0;j<arrR[k].length;j++)
    {
        System.out.println(arrR[k][j]);
    }
 





}

}


}
