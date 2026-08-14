class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int num = 5;
        while(num <= n){
            count += (n/num);
            num = num*5;
        }
        return count;
    }
}