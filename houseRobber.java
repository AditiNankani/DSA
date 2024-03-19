/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

    public static int rob(int[] nums){
       final int n=nums.length;
        if(n==0){
            return 0;
        }if(n==1){
            return nums[0];
        }
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        /*int no;
        no=sc.nextInt();
        int[] arr=new int[no];
        for(int i=0;i<no;i++){
            arr[i]=sc.nextInt();
        }
        int k=rob(arr);
       System.out.println(k);*/

       String input = sc.nextLine();
        String[] moneyStrings = input.split(",");
        int[] arr = new int[moneyStrings.length];
        for (int i = 0; i < moneyStrings.length; i++) {
            arr[i] = Integer.parseInt(moneyStrings[i].trim());
        }
        int k = rob(arr);
        System.out.println( k);
	}
}
