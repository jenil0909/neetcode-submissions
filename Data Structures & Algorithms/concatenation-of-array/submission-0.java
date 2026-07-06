class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[2 * nums.length]; // create array of size 2n
        int t = 0;
        while (t < 2 * nums.length) { // loop until 2n
            output[t] = nums[t % nums.length]; // copy nums twice
            t++;
        }
        return output; // return result
    }
}
