class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int length = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>2){
                while(s.charAt(l)!=ch){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    l++;
                    length--;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
                length--;
                

            }
            length++;
            max = Math.max(length,max);
            
        }
        return max;
    }
}