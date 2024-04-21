class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<=r;){
            if(nums[i]==0){
                swap(nums,i++,l++);
            }else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,r--);
            }
        }
    }
        public void swap(int[] nums,int i,int j)
{
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;
}    }




//using arraylist
import java.util.* ;
import java.io.*; 
public class Solution {
    
      public static void sortArray(ArrayList<Integer> arr,int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}



//using arraylist 
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int one = 0;
        int zero = 0;
        int two = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i) == 1) {
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        while (zero-- > 0) {
            arr.set(index, 0);
            index++;
        }

        while (one-- > 0) {
            arr.set(index, 1);
            index++;
        }

        while (two-- > 0) {
            arr.set(index, 2);
            index++;
        }
    }

}
