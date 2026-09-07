class Solution {
    public int lengthOfLongestSubstring(String s) {
          if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        int maxLength = 0, left = 0;

        for (int right = 0; right< s.length();right++){
            Character ch = s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

              int currentWindowSize = right - left + 1;

            // Keep track of the biggest window size we have ever seen
            maxLength = Math.max(maxLength, currentWindowSize);
            

        }
        return maxLength;
    }
}
