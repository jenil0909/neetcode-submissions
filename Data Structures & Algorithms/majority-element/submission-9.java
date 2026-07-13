class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maxFrequentElement = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                // reset candidate when count drops to zero
                maxFrequentElement = nums[i];
                count = 1;
            } else if (nums[i] == maxFrequentElement) {
                // same as candidate → increment
                count++;
            } else {
                // different element → decrement
                count--;
            }
        }
        return maxFrequentElement;
    }
}
