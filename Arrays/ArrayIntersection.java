import java.util.*;
public class arrayIntersection{
	public static void intersect(int[] arr1,int size1,int[] arr2,int size2) {
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(array[i]);
			}
		}
	}
	}
	
	public static void main(String args[]) {
		int[] arr=new int[100];
		int[] brr=new int[100];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		for(int j=0;j<m;j++) {
			brr[j]=sc.nextInt();
			}
		intersect(arr,n,brr,m);
		}
}
