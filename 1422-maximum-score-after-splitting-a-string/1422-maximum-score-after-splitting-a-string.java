class Solution {
    public int maxScore(String s) {
        int[] pref = new int[s.length()];
        pref[0] = 0;
        int sufix = 0;
        for(int i = 1; i < pref.length; i++){
            if(s.charAt(i-1)=='0'){
                pref[i]=1;
            }
            pref[i]+=pref[i-1];
        }
        int max = 0;
        for(int i = s.length()-1; i > 0; i--){
            if(s.charAt(i)=='1'){
                sufix++;
            }
            max = Math.max(max,sufix + pref[i]);
        }
        return max;

    }
}