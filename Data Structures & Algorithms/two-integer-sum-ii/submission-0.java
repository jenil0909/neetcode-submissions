class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0; int j = numbers.length -1;
        int[] finall = new int [2];

        while (i<j){
            int sum =numbers[i] + numbers[j];
            if(sum == target){
                finall[0] = i +1 ;
                finall[1] = j +1 ;
                return finall;
            }
            
           else if (numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                i++;
            }
        }

        return finall;
    }
}
