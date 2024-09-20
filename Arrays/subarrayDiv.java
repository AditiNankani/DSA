/*
Problem Statement
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
A subarray is a contiguous part of an array
Example 1
Input: 

6

4 5 0 -2 -3 1

5
Output: 

7
Explanation:

There are 7 subarrays with a sum divisible by k = 5:

[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]*/


// You are using Java
// You are using Java
import java.util.*;

class Main{
    public static int gifts(int arr[],int k){
        Map<Integer,Integer> remainderCnt=new HashMap<>();
        remainderCnt.put(0,1);
        int cnt=0;
        int csum=0;
        
        for(int num:arr){
            csum+=num;
            int rem=((csum%k)+k)%k;
            cnt+=remainderCnt.getOrDefault(rem,0);
            remainderCnt.put(rem,remainderCnt.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int b=gifts(arr,k);
        System.out.println(b);
        }
}
