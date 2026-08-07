class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int low =0 ; int high = len-1;
        int Max = 0;
        int MaxLeft = 0; int MaxRight= high;
        while (low<high){
            int Area =  Math.min(heights[low], heights[high]) * (Math.abs(high-low));   
            if (Area > Max){
                Max = Area;
                MaxLeft = low;
                MaxRight= high;
            }
            if (heights[low]<heights[high]) low++;

            else if (heights[low]>heights[high]) high--;

            else {
                high--;
                low++;
            }
        }
        return Max;
    }
}
