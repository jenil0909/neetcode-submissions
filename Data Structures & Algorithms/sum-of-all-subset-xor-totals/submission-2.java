class Solution {
    public int subsetXORSum(int[] nums) {
        // Start at index 0 with a running XOR of 0
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int index, int currentXOR) {
        // Base Case: If we have made a choice for every number, stop and return the XOR we built
        if (index == nums.length) {
            return currentXOR;
        }

        // Choice 1: PICK the current number (XOR it with our running total)
        int pick = helper(nums, index + 1, currentXOR ^ nums[index]);

        // Choice 2: SKIP the current number (keep the running total the same)
        int skip = helper(nums, index + 1, currentXOR);

        // Return the sum of both paths
        return pick + skip;
    }
}
