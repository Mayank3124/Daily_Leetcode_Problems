class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expend(s,i,i);
            int len2 = expend(s,i,i+1);

            int len = Math.max(len1,len2);

            if(len > end - start + 1){
                start = i - (len - 1)/2;
                end = i + (len)/2;
            }
        }
        return s.substring(start,end + 1);

    }
    public int expend(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}