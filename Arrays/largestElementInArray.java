
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int k=arr.length;
        int max=arr[0];
        for(int i=1;i<k;i++){
            if(arr[i]>max){            
             max=arr[i];
            }
        }
        return max;
       // System.out.println(max);
    }
}

