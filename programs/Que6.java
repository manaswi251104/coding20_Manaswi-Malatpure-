import java.util.Scanner;
class Que6
{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,1,6,7,4,5};
        int i,j;
        for (i = 0; i < arr.length; i++){
            for ( j = 0; j < i; j++){
            if (arr[i] == arr[j])
                break;
            }
            if (i == j)
            System.out.print( arr[i] + " ");
        }
    }
}