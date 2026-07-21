class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );

        for(char ch : tasks){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        pq.addAll(map.keySet());
        int max = map.get(pq.poll());
        int count = 1;
        while(!pq.isEmpty()){
            if(map.get(pq.poll())<max){
                break;
            }
            count++;
        }
        
        int ans = (max-1)*(n+1) + count;

        if(tasks.length > ans){
            return tasks.length;
        }
        return ans;
    }
}