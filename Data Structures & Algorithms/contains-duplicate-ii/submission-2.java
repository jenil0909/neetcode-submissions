class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length ==0) return false;
        if (nums.length == 1) return false;
        if (nums.length ==2){
            return (nums[0] == nums[1] && Math.abs(nums[1]-nums[0]) <=k)? true: false;
        }
 HashSet<Integer> window = new HashSet<>();

int left = 0;
    for (int i =0;i< nums.length ;i++){

         if (i - left > k ){
            window.remove(nums[i-k-1]);
            left++;
        }

        if (window.contains(nums[i])) return true;

       
        
        window.add(nums[i]);
        

       
    }
    return false;

    }

}