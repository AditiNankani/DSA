
    public class Solution {
static int sec_largest(int[] a,int n){
    int largest=a[0];
    int slargest=Integer.MIN_VALUE;
    for(int i=1;i<n;i++){
        if(a[i]>largest){
            slargest=largest;
            largest=a[i]; 
        }
        else if(a[i]<largest && a[i]>slargest){
            slargest=a[i];
        }
    }
return slargest;
    }
    
static int sec_smallest(int[] a,int n){
    int smallest=a[0];
    int ssmallest=Integer.MAX_VALUE;
    for(int i=1;i<n;i++){
        if(a[i]<smallest){
            ssmallest=smallest;
            smallest=a[i];
        }
        else if(a[i]!=smallest && a[i]<ssmallest){
            ssmallest=a[i];
        }
    }
    return ssmallest;
}
        public static int[] getSecondOrderElements(int n, int []a) {
int slargest=sec_largest(a,n);
int ssmallest=sec_smallest(a,n);
int[] res={slargest,ssmallest};
return res;
    }
}
