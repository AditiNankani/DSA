import java.util.ArrayList;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> lead = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            boolean isLeader = true; // Assume arr[i] is a leader by default
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    isLeader = false; // If any element to the right is >= arr[i], arr[i] is not a leader
                    break; // No need to check further for this arr[i]
                }
            }
            
            if (isLeader) {
                lead.add(arr[i]); // Add arr[i] to leaders list if it passed all checks
            }
        }
        
        return lead;
    }
    
    // Sample usage
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        ArrayList<Integer> result = leaders(n, arr);
        System.out.println("Leaders in the array are: " + result);
    }
}
