class Solution {
    public int pivotInteger(int n) {
        long sum = (long)n*(n+1)/2;
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = l + (r - l)/2;
            long left = (long)mid*(mid+1)/2;
            long right = sum + mid - left;
            if(right < left){
                r = mid-1;
            }else if (left < right){
                l = mid + 1;
            }else return mid;

        }
        return -1;
    }
}