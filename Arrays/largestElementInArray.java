
Your EXP
120
Topics
Problem
Submissions
Solutions
Discuss
 Largest Element in the Array
Easy
40/40
Average time to solve is 10m
285 upvotes
Asked in companies
Problem statement
Given an array ‘arr’ of size ‘n’ find the largest element in the array.



Example:

Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

Output: 5

Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
Detailed explanation ( Input/output format, Notes, Images )
Sample input 1:
6
4 7 8 6 7 6 
Sample output 1:
8
Explanation of sample input 1:
The answer is 8.
From {4 7 8 6 7 6}, 8 is the largest element.
Sample input 2:
8
5 9 3 4 8 4 3 10 
Sample output 2:
10
Expected Time Complexity:
O(n), Where ‘n’ is the size of an input array ‘arr’.
Constraints :
1 <= 'n' <= 10^5
1 <= 'arr[i]' <= 10^9

Time Limit: 1 sec
Java (SE 1.8)
1234567891011121314151617
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int k=arr.length;
        int max=arr[0];
        for(int i=1;i<k;i++){
            if(arr[i]>max){

