import java.util.Scanner;

public class tripletSum{
	public static void sum(int arr[],int ke,int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n-1;k++) {
				if(arr[i]+arr[j]+arr[k]==ke){
            System.out.println("(" + arr[i] + "," + arr[j] +","+arr[k]+")");
            break;
			}
		}
			}
	}
	}	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
int key=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();}
		sum(array,key,n);
		}
}
