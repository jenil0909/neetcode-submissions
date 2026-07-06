class Solution {
    public boolean isAnagram(String s, String t) {
        char [] charArr = s.toCharArray();
        Arrays.sort(charArr);
        char [] charArr2 = t.toCharArray();
        Arrays.sort(charArr2);

        if (charArr.length != charArr2.length) return false;
        else {
            for(int i =0; i< charArr.length ; i++){
                if (charArr[i] != charArr2[i])
                return false;
            }
        }

    return true;
    }
}
