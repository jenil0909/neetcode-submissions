class Solution {
    public int hammingWeight(int n) {
        //
// Naive Bitwise Shift (n & 1)

// Check the least significant bit with a bitwise AND operation, increment your counter if it equals 1, and then right-shift the number until it becomes 0.
// • Time Complexity: \(\mathcal{O}(\log n)\)
// • Space Complexity: \(\mathcal{O}(1)\)

int cnt = 0;

while (n>0){
    cnt += (n&1);
    n = n>>>1;
}
return cnt;
    }
}
