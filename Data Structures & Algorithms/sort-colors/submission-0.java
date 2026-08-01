class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int i = 0;
        // Fill array in order 0, 1, 2
        for (int color = 0; color <= 2; color++) {
            int count = map.getOrDefault(color, 0);
            while (count-- > 0) {
                nums[i++] = color;
            }
        }
    }
}
