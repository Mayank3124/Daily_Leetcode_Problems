class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
            if(i >= k){
                if(isVowel(s.charAt(i-k))){
                    cnt--;
                }
            }
            if(cnt == k) return k;
            max = Math.max(max,cnt);
            
        }
        return max;
    }
}