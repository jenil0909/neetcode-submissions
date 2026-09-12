class Solution {
    public int findMin(int[] nums) {
        int max = Arrays.stream(nums).min().getAsInt();;
        return max;
    }
}
