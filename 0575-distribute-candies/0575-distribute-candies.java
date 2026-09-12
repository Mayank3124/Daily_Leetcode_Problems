class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int t = 0;
        for(int type : candyType){
            set.add(type);
            
        }

        return Math.min(candyType.length/2,set.size());
        
    }
}