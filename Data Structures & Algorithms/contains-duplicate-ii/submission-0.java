class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length ==0) return false;
        if (nums.length == 1) return false;
        if (nums.length ==2){
            return (nums[0] == nums[1] && Math.abs(nums[1]-nums[0]) <=k)? true: false;
        }
 HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // 1. If duplicate is found within the window of size k
            if (window.contains(nums[i])) {
                return true;
            }

            // 2. Add current number to window
            window.add(nums[i]);

            // 3. Keep the window size exactly <= k by removing the oldest element
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}