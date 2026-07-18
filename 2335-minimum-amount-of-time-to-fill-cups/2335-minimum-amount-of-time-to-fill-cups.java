class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : amount){
            pq.offer(i);
        }
        int max = pq.poll();
        int other = pq.poll() + pq.poll();
        if(max<other)
        {int add =Math.abs(max - other);
        if(add%2!=0){
            add++;
        }
        max += add/2;}

        return max;

    }
}