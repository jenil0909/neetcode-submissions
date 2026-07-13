class Solution {
  public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int result [] = new int[2];
        int i = 0, j = length - 1;
        while (i<=j){
            if (nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                break;
            }
            else if (nums[i] + nums[j] > target){
                j--;
            }
            else {
                i++;
            }
        }

        return result;
    }  
}
