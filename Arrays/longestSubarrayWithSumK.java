
/*approach-1
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n=a.length;
        int maxlength = 0;
        long sum = 0;
        for (int i = 0; i < n; i++){
            sum += a[i];
        }
        if (sum == k) {
            return n;
        }
        sum = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            sum += a[end];
            while (sum > k) {
                sum -= a[start++];
            }
            if (sum == k) {
                maxlength = Math.max(maxlength, end - start + 1);
            }
        }
        return maxlength;
    }
}
*/


public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;

        int maxLength = 0;

        for (int i = 0; i < n; ++i) {
            long currentSum = 0;
            for(int j = i; j < n; ++j) {
                currentSum += a[j];

                if(currentSum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                 if (currentSum > k) {
                    break; 
                }
            }
        }





        /* solution-2*/

        class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int y=Math.min(nums[i],nums[j]);
				int z=Math.max(nums[i],nums[j]);
                           /* System.out.println("(" + y + "," + z + ")");
            break;*/
                        return new int[]{i,j};


                }
            }
        }
            return new int[]{0,0};

    }
}

        return maxLength;
    }
}
