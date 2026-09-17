class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(triangle.get(0).get(0));
        int i = 1;
        while(i < triangle.size()){
            int j = 0;
            int size = dq.size();
            while(size-- > 0){
                int n = dq.removeFirst();
                if( j != 0){
                    dq.add(Math.min(n + triangle.get(i).get(j),dq.removeLast()));
                }
                else dq.addLast(n + triangle.get(i).get(j));
                j++;
                dq.addLast(n + triangle.get(i).get(j));
            }
            i++;
        }
        int min = Integer.MAX_VALUE;
        while(!dq.isEmpty()){
            min = Math.min(min,dq.removeFirst());
        }
        return min;
    }
}