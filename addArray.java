import java.util.*;

public class addArray{

    public static void ArraySum(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int carry = 0;
        int[] result = new int[Math.max(m, n) + 1]; // Increase size to handle carry

        int k = result.length - 1; // Index for result array

        while (i >= 0 && j >= 0) {
            int val1 = arr1[i];
            int val2 = arr2[j];
            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            i--;
            j--;
            k--;
        }

        // Case: length of 1st array > length of 2nd array
        while (i >= 0) {
            int sum = arr1[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            i--;
            k--;
        }

        // Case: length of 2nd array > length of 1st array
        while (j >= 0) {
            int sum = arr2[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            j--;
            k--;
        }

        // Handle the remaining carry
        while (carry != 0) {
            result[k] = carry % 10;
            carry = carry / 10;
            k--;
        }

       
        for (int x = k+1 ; x < result.length; x++) {
        System.out.print(result[x] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        n = sc.nextInt();
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = sc.nextInt();
        }
        ArraySum(arr, m, brr, n);
    }
}

