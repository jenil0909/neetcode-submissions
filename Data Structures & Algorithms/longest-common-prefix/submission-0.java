class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Take the first string as reference
        String first = strs[0];
        int prefixLength = first.length();

        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;

            // Compare character by character
            while (j < prefixLength && j < current.length() && first.charAt(j) == current.charAt(j)) {
                j++;
            }

            // Update prefix length to the matched portion
            prefixLength = j;

            // If at any point prefix becomes empty, return ""
            if (prefixLength == 0) return "";
        }

        return first.substring(0, prefixLength);
    }
}
