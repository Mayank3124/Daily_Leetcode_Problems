class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int idx = n-1;

        while( idx-- > 0 ){
            if(arr[idx] > arr[idx+1]){
                break;
            }
        }
        if(idx < 0) return arr;
        int i = idx;
        while(i++ < n-1){
            if(arr[i]>= arr[idx])break;
        }
        i--;
        while( i > 0 && arr[i]==arr[i-1]){
            i--;
        }
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
        return arr;
    }
}