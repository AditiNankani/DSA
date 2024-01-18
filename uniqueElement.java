//finding unique element in an array
import java.util.*;
public class uniqueElement{
	public static void unique(int[] array) {
		int i,j;
		for(i=0;i<array.length;i++) {
			int cnt=0;
			for(j=0;j<array.length;j++) {
			if(i!=j && array[i]!=array[j]) {
				cnt++;
				break;
			}
			}
		if(cnt==0) {
		System.out.println(array[i]);
	}
		}
	}
	
	public static void main(String args[]) {
		int[] arr=new int[100];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		unique(arr);
		}
}