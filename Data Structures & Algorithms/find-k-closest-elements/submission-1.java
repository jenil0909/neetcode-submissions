
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Binary search for the starting index of the optimal window of size k
        int left = 0;
        int right = arr.length - k;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Compare the distance of the element just outside the window on the right (mid + k)
            // with the element at the start of the window (mid)
            if (x - arr[mid] > arr[mid + k] - x) {
                // The element at mid + k is closer to x than the element at mid.
                // This means the window must shift to the right.
                left = mid + 1;
            } else {
                // The element at mid is closer (or equidistant and smaller) than mid + k.
                // The window stays here or shifts left.
                right = mid;
            }
        }
        
        // Build the final result array from the optimal window [left, left + k - 1]
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }
}
