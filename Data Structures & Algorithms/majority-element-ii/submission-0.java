class Solution {
    public List<Integer> majorityElement(int[] nums) {
      
        List<Integer> result = new ArrayList<>();

        if ( nums == null || nums.length ==0)return result;
  int length = nums.length;
        Integer can1 = null ; Integer can2 = null;
        int countCan1 = 0 ; int countCan2 = 0;

        for(int num : nums){
            if (can1 != null && num == can1 ){
                countCan1++;
            }
            else if (can2 != null && num == can2  ){
                countCan2++;
            }
            else if ( countCan1==0){
                can1 = num;
                countCan1 =1;
            }else if ( countCan2 == 0 && num != can1){
                can2 = num;
                countCan2 = 1;
            }
            else {
                countCan1--;
                countCan2--;
            }
        }
         countCan1 = 0;
        countCan2 = 0;
        for (int num : nums) {
            if (can1 != null && num == can1) countCan1++;
            else if (can2 != null && num == can2) countCan2++;
        }

        int threshold = length / 3;
        if (can1 != null && countCan1 > threshold) result.add(can1);
        if (can2 != null && countCan2 > threshold) result.add(can2);

        return result;
    
}}