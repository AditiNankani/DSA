//finding duplicate element in an array
import java.util.*;
public class duplicateElement{
	public static void duplicate(int[] array,int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
		if(array[i]==array[j]) {
		System.out.println(array[i]);
		break;
	}
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
		duplicate(arr);
		}
}