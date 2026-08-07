class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int pref[] =new int[arr.length+1] ;
        pref[0] = 0;
        for(int i = 1; i < pref.length; i++){
            pref[i] = pref[i-1] + arr[i-1];
            sum += arr[i-1];
        }
        for(int i = 3; i <= arr.length; i = i + 2 ){
            for(int j = i; j < pref.length; j++){
                sum += (pref[j]-pref[j-i]);
            }
        }
        return sum;
    }
}