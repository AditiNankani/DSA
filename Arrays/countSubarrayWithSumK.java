//1st method
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
                    int cnt=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
            sum+=nums[j];
         
       
        if(sum==k){
            cnt++;
        }}}
        return cnt;
    }
}




//2nd method
class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 having one count
        
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return cnt;
    }
}

