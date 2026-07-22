class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int length = 0;
        boolean odd = false;
        for(char ch : map.keySet()){
            int k = map.get(ch);
            if(k%2!=0){
                odd = true;
                k--;
            }
            length += k; 
        }
        if(odd) length++;
        return length;
    }
}