class Solution {
    
        
 public String longestCommonPrefix(String[] str) {
        if(str.length==0) return "";
        Arrays.sort(str);
        int count=0;
        for(int i=0;i<str[0].length() && i<str[str.length-1].length();i++) {
            if(str[0].charAt(i)==str[str.length-1].charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return count==0?"":str[0].substring(0,count);
    }
}
