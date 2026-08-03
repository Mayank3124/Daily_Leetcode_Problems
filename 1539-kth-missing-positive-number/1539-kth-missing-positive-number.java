class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr[arr.length-1]-arr.length < k){
            return arr[arr.length-1] + k -(arr[arr.length-1]-arr.length);
        }else if(arr[0]-1 >= k){
            return k;
        }
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            int mid = l + ( r - l )/2;
            int dif = arr[mid] - mid - 1;
            if(dif < k){
                l = mid + 1 ;
            }else {
                r = mid ;
            }
        }
        return arr[l-1] + k - (arr[l - 1] - l );
        
    }
}