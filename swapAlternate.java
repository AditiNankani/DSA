import java.util.*;

public class swapAlternate{
public static void swap(int[] array){
	int i=0;
	int j=i+1;
	while(j<array.length) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		i=i+2;
		j=i+1;
	}
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in) 
		int n;
		int[] arr=new int[100];
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	swap(arr);
	System.out.println("Swapped array");
	for(int k=0;k<=array.length;k++) {
		System.out.println(array[k]);
	}
}
}