import java.util.Scanner;
class Que7
{
    public static void main(String args[])
    {
        int[] a1={1,2,5,8,7,9};
        int[] a2={3,2,6,7,10,1};
        
       for(int i=0;i<a1.length;i++){
           for(int j=0;j<a2.length;j++){
               if(a1[i]==a2[j]){
                 System.out.print( a1[i] + " ");  
             }
          }
        }
    }
}
