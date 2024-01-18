import java.util.*;

public class reverseAnArray{
public static void reverse(int[] array,int n) {
	int[] arr=new int[n];
	int j=n;
	for(int i=0;i<n;i++) {
		arr[j-1]=array[i];
		j=j-1;
	}
	System.out.println("Reversed array: ");
	for(int k=0;k<n;k++) {
		System.out.println(arr[k]);
	}
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
 int no;
 int[] a=new int[100];
 System.out.println("enter array size");
 no=sc.nextInt();
 System.out.println("Enter array: ");
 for(int m=0;m<no;m++) {
	 a[m]=sc.nextInt();
	}
 reverse(a,no);
 }
}