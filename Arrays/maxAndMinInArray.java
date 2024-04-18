//max and min element in an arrayimport java.util.*;
public class Main {
    public static void main(String[] args) {
      int arr[]=new int[10];
      int size;
      Scanner sc=new Scanner(System.in);
      size=sc.nextInt();
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      findMax(arr,size);
      findMin(arr,size);
  }
  
  public static void findMax(int[] array,int n){
     int maximum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
     if(array[i]>maximum){
       maximum=array[i];
     }
     
    //alternative   maximum=Math.max(maximum,array[i]);
     
    }
    System.out.println("max element is"+maximum);
  }
  
  public static void findMin(int[] array,int n){
     int minimum=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
     if(array[i]<minimum){
       minimum=array[i];
     }
      //alternative   minimum=Math.min(minimum,array[i]);
    }
    System.out.println("min element is"+minimum);
  }
}
