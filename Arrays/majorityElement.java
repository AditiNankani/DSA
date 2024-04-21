class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       return nums[n/2];
    }
}



//approach-2
public class Solution {
    public static int majorityElement(int []v) {
        int cnt=0;
        int candidate=0;
        for(int num:v){
            if(cnt==0){
                candidate=num;
            }

            if(num==candidate){
                cnt++;
            }else{
                cnt--;
            }
        }
        return candidate;
    }
}
