import java.util.*;
public class binarySearch{
	public static void bs(int[] arr,int key) {
		int end=arr.length-1;
		int start=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(key<arr[mid]) {
				end=mid-1;
			}else if(key>arr[mid]) {
				start=mid+1;
				}else {
					return mid;
				}
		}
	}
	return -1;

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		int[] array=new int[100];
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int ans=bs(array,target);
		System.out.println(ans);
	}
}