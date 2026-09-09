import java.util.*;
class Solution {
    public boolean Helper(List<List<Integer>> l, boolean[] check, int s, int d ){
        if(s == d) return true;
        check[s] = true;
        for(int i = 0; i < l.get(s).size(); i++){
            int num = l.get(s).get(i);
            if(!check[num]){
                if(Helper(l,check,num,d)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            l.add(new ArrayList<>());
        }
        

        for(int[] edge : edges){
            l.get(edge[0]).add(edge[1]);
            l.get(edge[1]).add(edge[0]);
        }
        return Helper(l,new boolean[n], source, destination);


    }
}