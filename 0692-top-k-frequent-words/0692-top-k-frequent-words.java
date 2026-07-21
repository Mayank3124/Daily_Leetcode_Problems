class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if(!map.get(a).equals(map.get(b))){
                    return map.get(b) - map.get(a);
                }
                return a.compareTo(b);
            }
        );
        pq.addAll(map.keySet());
        List<String> list = new ArrayList<>();

        while(k-- > 0){
            list.add(pq.poll());
        }
        return list;
    }
}