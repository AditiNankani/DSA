class Solution {



   /* public int getPivot(int[] arr,int n){
        int s=0,e=n-1;
   // int mid=s+(e-s)/2;

        while(s<e){
                int mid=s+(e-s)/2;

            if(arr[mid]>arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
           // mid=s+(e-s)/2;
        }
        return s;
    }



      public static int bs(int[] nums,int start,int end,int target) {

		while(start<=end) {
        int mid=start+(end-start)/2;

			if(target<nums[mid]) {
				end=mid-1;
			}else if(target>nums[mid]) {
				start=mid+1;
				}else {
					return mid;
				}
		}
        	return -1;
	}




    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==0) return -1;
        int pivot=getPivot(nums,n);
        if(target>=nums[pivot] && target<=nums[n-1]){

        return bs(nums,pivot,n-1,target);
        }else{
            return bs(nums,0,pivot-1,target);
        }
    }
}*/

public int search(int[] nums, int target) {
    int n = nums.length;
    int start = 0, end = n - 1;
    
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > nums[mid] && target <= nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    return -1;
}
}
