import java.util.*;

public class pairSum{
	public static void sum(int arr[],int k) {
	//	int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k){
				//	cnt++;
				int y=Math.min(arr[i],arr[j]);
				int z=Math.max(arr[i],arr[j]);
				//System.out.println("("+Math.min(arr[i],arr[j])+ "," +Math.max(arr[i],arr[j])+")");
            System.out.println("(" + y + "," + z + ")");
            break;
			}
		}
		//System.out.println(cnt);
	}
	}	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
int key=sc.nextInt();
		int[] array=new int[100];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();}
		sum(array,key);
		}
}