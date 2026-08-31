class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length ==0 || nums == null) return 0;
        Arrays.sort(nums);
        int maxCount = 1;
int count=1;
        for (int i = 1; i< nums.length;i++){
            if (nums[i] == nums[i-1]){
                continue;
            }
            if (nums[i] - nums[i-1] == 1){
                 count++;
                
            }
            else{
                maxCount = Math.max(count,maxCount);
                count=1;
            }
           
            
        }

        maxCount = Math.max(maxCount,count);
        return maxCount;
    }

}
