//sum of array elements
import java.util.*;

public class Main{
public static void main(String[] args){
  int size;
  int[] arr=new int[10];
  Scanner sc=new Scanner(System.in);
  size=sc.nextInt();
  for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
  }
  sumOfArray(arr,size);
}

public static void sumOfArray(int array[],int n){
  int sum=0;
  for(int i=0;i<n;i++){
    sum+=array[i];
  }
  System.out.println(sum);
}

}
