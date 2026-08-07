class Solution {
    public void rotate(int[] nums, int k) {
        // if(nums.length == 0) return nums;
        // if (nums.length == 1) return nums;

        int[] res = new int[nums.length];
        int count =0;
        k = k%nums.length;
        for (int i = nums.length-k;i< nums.length;i++ ){
            res[count++] = nums[i];
        }

        for (int i =0;i< nums.length-k;i++){
            res[count++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
    nums[i] = res[i];
}
    }
}