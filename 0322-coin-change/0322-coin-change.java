class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int numCoins = 0;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[amount+1];
        q.add(amount);
        visited[amount] = true;

        while(!q.isEmpty()){
            numCoins++;
            int size = q.size();
            while(size-- > 0){
                int amt = q.remove();
                for(int coin : coins){
                    if(coin == amt) return numCoins;
                    int next = amt - coin;
                    if(next > 0 && !visited[next]) {
                        q.add(amt - coin);
                        visited[next] = true;
                    }
                }
            } 
        }
        return -1;
    }
}