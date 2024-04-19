
//union of arrays

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        
        List<Integer> res = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                res.add(a[i++]);
            } else if (a[i] > b[j]) {
                res.add(b[j++]);
            } else {
                res.add(a[i]);
                i++;
                j++;
            }
        }
        
        while (i < n) {
            res.add(a[i++]);
        }
        
        while (j < m) {
            res.add(b[j++]);
        }
        
   
        int k = 1;
        while (k < res.size()) {
            if (res.get(k).equals(res.get(k - 1))) {
                res.remove(k);
            } else {
                k++;
            }
        }
        
        return res;
    }
}

