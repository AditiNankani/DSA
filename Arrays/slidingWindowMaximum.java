class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
          int n=nums.length;
        if(n==0 || k==0){
            return new int[0];
        }
      
        int a=n-k+1;
        int res[]=new int[a];
        for(int i=0;i<=n-k;i++){
                    int max=nums[i];
            for(int j=i;j<i+k;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            res[i]=max;
        }
return res;
      
    }
}





//method-2
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         List<Integer> res=new ArrayList<>();
         Deque<Integer> dq=new LinkedList<>();
         for(int i=0;i<nums.length;i++){
            int num=nums[i]; 
      while(!dq.isEmpty() && dq.getLast()<num){
        dq.pollLast();
      }
      dq.addLast(num);
 if(i>=k && nums[i-k]==dq.getFirst()){
        dq.pollFirst();
      }
      
      if(i>=k-1){
        res.add(dq.getFirst());
      }
     
         }
         return res.stream().mapToInt(i->i).toArray();
    }
}
