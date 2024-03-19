/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{public static int trap(int[] nums){
    int n=nums.length;
int res=0;
for(int i=1;i<n-1;i++){
    int l=nums[i];
    for(int j=0;j<i;j++){
        l=Math.max(l,nums[j]);
    }
    int r=nums[i];
    for(int j=i+1;j<n;j++){
        r=Math.max(r,nums[j]);
    }
    res+=Math.min(l,r)-nums[i];
}
return res;
}
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
		/*int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
int k=trap(arr,n);
System.out.println(k);*/

 String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int n = tokens.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int trappedWater = trap(arr);
        System.out.println(trappedWater);
	}
}
