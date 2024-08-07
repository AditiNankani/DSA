/*longest consecutive sequence array Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.*/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }

        int longest=0;
        for(int num:nums){
            if(!numSet.contains(num-1)){
                int length=1;

                while(numSet.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);            }
        }
        return longest;
    }
}
