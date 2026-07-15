class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int counter = 1; // you allow one deletion

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (counter == 1) {
                    // Instead of checking only one character ahead,
                    // validate the whole substring after skipping
                    return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
                } else {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }

    // Helper function to check if substring is palindrome
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
