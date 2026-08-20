class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] resSet = new int[len];
        
        int totalProduct = 1;
        int zeroCount = 0;

        // Step 1: Calculate total product and count zeroes
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        // Step 2: Populate results based on zero count
        for (int i = 0; i < len; i++) {
            if (zeroCount > 1) {
                // Scenario 3: More than one zero means everything is 0
                resSet[i] = 0;
            } else if (zeroCount == 1) {
                // Scenario 2: Exactly one zero
                if (nums[i] == 0) {
                    resSet[i] = totalProduct; // The zero element gets the product of the rest
                } else {
                    resSet[i] = 0; // All other elements are wiped out by the zero
                }
            } else {
                // Scenario 1: No zeroes at all
                resSet[i] = totalProduct / nums[i];
            }
        }

        return resSet;
    }
}