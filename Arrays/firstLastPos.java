public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[2];
       res[0]=-1;
       res[1]=-1;
                for(int i=0;i<n;i++){
                 if(nums[i]==target){
                 res[0]=i;
                 break;
                }}
                for(int i=n-1;i>=0;i--){
                    if(nums[i]==target){
                        res[1]=i;
                        break;
                    }
                }
            return res;
        }

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int[] arr=new int[100];
            int n=arr.length;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int tar=sc.nextInt();
             int[] result = searchRange(arr, tar);
       System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }
