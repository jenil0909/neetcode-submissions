class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Arrays.sort();
       HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            set.put(nums[i], set.getOrDefault(nums[i], 0) + 1);
        }

     
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set.entrySet());
        
     
        list.sort((a, b) -> b.getValue() - a.getValue());

  
        int[] result = new int[k]; // Array size should be k, not nums.length
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}