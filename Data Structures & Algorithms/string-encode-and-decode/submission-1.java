
class Solution {

    // Encode a list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decode a single string to a list of strings
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Find the separator #
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            j++; // move past '#'
            String s = str.substring(j, j + length);
            result.add(s);
            i = j + length;
        }
        return result;
    }}