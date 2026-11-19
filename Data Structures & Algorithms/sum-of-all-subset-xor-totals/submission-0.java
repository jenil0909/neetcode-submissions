class Solution {
    public int subsetXORSum(int[] nums) {
      if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int orTotal = Arrays.stream(nums)
                            .reduce(0, (a, b) -> a | b);
                            
        return orTotal << (nums.length - 1);
}}