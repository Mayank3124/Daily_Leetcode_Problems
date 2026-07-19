class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)-1);
        }
        for(char k : map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        return t.charAt(t.length()-1);
    }
}