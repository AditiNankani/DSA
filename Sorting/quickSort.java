
class Solution {
    static void quickSort(int arr[], int low, int high) {
        if(low<high){
        int partition_idx=partition(arr,low,high);
        quickSort(arr,low,partition_idx-1);
        quickSort(arr,partition_idx+1,high);}
    }

 static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int arr[], int low, int high) {
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<=high && arr[i]<=pivot ){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            
            if(i<j){
                swap(arr,i,j);
            }
          
        }
        swap(arr,low,j);
        return j;
    }
}
