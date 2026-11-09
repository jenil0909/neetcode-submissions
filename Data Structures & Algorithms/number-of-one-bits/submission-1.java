class Solution {
    public int hammingWeight(int n) {
        int i  = 0;

        while (n>0){
            // Brian Kernighan’s Algorithm (Optimal)
            //Subtracting 1 from a number and performing a bitwise AND with the original number (n & (n - 1)) always clears the rightmost set 1 bit. Repeat this loop until the number becomes 0, and count how many times the operation runs.

            n = n & (n-1);
            i++;
        }

        return i;
    }
}
