class Solution {
    
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();

        q.add(n);
        int sum = 0;
        while(!q.isEmpty()){
            sum++;
            int size = q.size();
            while(size-- > 0){
                int num = q.remove();
                for(int i = 1; i*i <= num; i++  ){
                    if(num == (i * i)) return sum;
                    q.add(num - (i * i));
                }
            }
        }
        return sum;
    }
}