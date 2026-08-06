class Solution {
    public int search(int[] nums, int target) {
        return BinarySearch(0,nums.length-1, target, nums);
    }

    public int BinarySearch(int low, int high, int target, int[] nums){
        int mid = low + (high-low)/2;
        if (low> high) return -1;
        if (nums[mid] == target) return mid;

         if (nums[mid] < target) return BinarySearch(mid+1,high,target,nums);

       if (nums[mid] > target) { 
        return BinarySearch(low,mid -1 ,target,nums);
        }

    return -1;
    }
}
