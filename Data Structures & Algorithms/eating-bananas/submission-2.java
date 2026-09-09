class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int sum;
        int max = 0;
        for (int i = 0; i<piles.length;i++){
           max = Math.max(max,piles[i]);
        }
        sum = max;
int low = 1;

        while (low<=max){
            int mid = low + (max-low)/2;
             long curr = 0;
            for(int i = 0;i< piles.length;i++){
                
                curr = (long)Math.ceil((double)piles[i]/mid) + curr;
                
            }
            if (curr <=h){
                // sum = Math.min(sum, curr);
                sum=mid;
               max = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return sum;

    }
}
