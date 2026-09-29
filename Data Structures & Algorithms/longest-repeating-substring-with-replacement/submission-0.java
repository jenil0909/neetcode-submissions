class Solution {
    public int characterReplacement(String s, int k) {
        
char[] chr = s.toCharArray();
    HashMap<Character,Integer> map = new HashMap<>();

    int left = 0, maxCount =  0; int maxLength = 0;

    for (int right = 0;right<chr.length;right++){
        
        char c =chr[right];
      map.put(c , map.getOrDefault(c,0) + 1);
        int countOfVariable = map.get(c);

        maxCount = Math.max(maxCount, countOfVariable);

        int currentWindowLength = right-left + 1;

        if (currentWindowLength - maxCount > k ){
            map.put(chr[left] , map.getOrDefault(chr[left],0) -1);
            left++;
        }
   currentWindowLength = right-left + 1;
        maxLength = Math.max(maxLength, currentWindowLength);

    }
    return maxLength;
        
    }
}
