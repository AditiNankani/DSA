//linear search
import java.util.*;

public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int key=sc.nextInt();
         linearSearch(arr, n, key);

    
    }
    
    public static void linearSearch(int[] array,int n,int key){
        for(int i=0;i<n;i++){
            if(key==array[i]){
               System.out.println("found at"+i);
                              return;
            }}
                         System.out.println("not found");
  
        }
}
