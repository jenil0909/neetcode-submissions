class Solution {

    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1;

        while(l<=r) {
            int m = l+(r-l)/2;

            if(target == nums[m]) {
                return m;
            } else if(target > nums[m]) {
                l = m+1;
            } else {
                r = m-1;
            }
        }

        return l;
    }

    public int searchInsert2(int[] nums, int target) {
        for(int i=0; i<=nums.length; i++) {
            if(i==nums.length || nums[i]>=target) {
                return i;
            } 
        }

        return 0;
    }
}