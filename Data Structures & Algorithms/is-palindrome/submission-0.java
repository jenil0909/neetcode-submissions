class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
return cleaned.equals(new StringBuilder(cleaned).reverse().toString());

    }
}
