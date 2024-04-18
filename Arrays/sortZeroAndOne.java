
import java.util.*;

public class sortZeroAndOne{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[100];
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr,0,n);
		 for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
