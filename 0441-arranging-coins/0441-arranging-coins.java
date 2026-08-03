class Solution {
    public int arrangeCoins(int n){
        int left = 0;
        int right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            long val = (long)mid * (mid + 1)/2;
            long res=n-val;
            if(mid == res)return mid;
             else if(mid<res)left=mid+1;
             else {
                right = mid-1 ;
            }
        }
        return left;
    }
}