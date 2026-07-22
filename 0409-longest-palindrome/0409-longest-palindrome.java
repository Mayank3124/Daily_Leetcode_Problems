class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int length = 0;
        int mid = 0;
        for(char ch : map.keySet()){
            int k = map.get(ch);
            if(k%2==0){
                length += k;
                map.put(ch,0);
            } else {
                length += k - 1;
                map.put(ch,1);
                mid = 1;

            }
        }
        if(mid==1) length++;
        return length;
    }
}