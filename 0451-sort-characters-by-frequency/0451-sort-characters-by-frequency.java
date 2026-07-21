class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );
        for(int i = 0; i < s.length(); i++ ){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        pq.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder("");
        while(!pq.isEmpty()){
            char c = pq.poll();
            int count = map.get(c);
            while(count-- >0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}