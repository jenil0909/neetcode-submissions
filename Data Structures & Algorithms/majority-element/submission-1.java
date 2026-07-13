class Solution {
    public int majorityElement(int[] nums) {
     int count = 1;
     int maxFrequentElement = nums[0];
     for (int i = 1;i < nums.length; i ++){
        if (nums[i] == maxFrequentElement){
            count++;
        }
        else {
            count--;
            if (count == 0){
                maxFrequentElement = nums[i];
            }
        }
     }
        return maxFrequentElement;
    }
}