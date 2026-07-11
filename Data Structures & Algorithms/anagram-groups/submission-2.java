
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Step 1: create key by sorting characters
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Step 2: insert into map without computeIfAbsent
            List<String> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(s);
        }

        // Step 3: return grouped anagrams
        return new ArrayList<>(map.values());
    }
}
