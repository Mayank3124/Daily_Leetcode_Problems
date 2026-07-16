class Solution {
    public Boolean ispossible(int[] piles, int mid, int h){
        int totalHours = 0;
        for(int i = 0; i < piles.length; i++){
            totalHours += piles[i]/mid;
            if(piles[i]%mid > 0){
                totalHours++;
            }
        }
        if(totalHours<=h) return true;
        return false;
    }
    public int max(int[] arr){
        int m = 0;
        for(int i : arr){
            m = Math.max(m, i);
        }
        return m;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Integer.MAX_VALUE;
        int ans = -1;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(ispossible(piles,mid,h)){
                r = mid-1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}