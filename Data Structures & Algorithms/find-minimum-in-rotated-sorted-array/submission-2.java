class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int currentMin = Integer.MAX_VALUE; // Track the minimum value directly

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] <= nums[high]) {
                currentMin = Math.min(currentMin, nums[mid]); // Keep the smaller one
                high = mid - 1;
            } else {
                currentMin = Math.min(currentMin, nums[high]); // High could be smaller
                low = mid + 1;
            }
        }
        return currentMin;
    }
}
