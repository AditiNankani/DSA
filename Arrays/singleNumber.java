/* When two bits are XORed, the result is 1 if the two bits are different, and 0 if they are the same.

In the given code, when we XOR a number with itself, the result is 0, and XORing a number with 0 gives the number itself. Therefore, when we XOR all the numbers in the array together, the numbers that appear twice will cancel each other out, leaving only the number that appears once.*/

class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
             k=k^nums[i];
        }
        return k;
    }
}
