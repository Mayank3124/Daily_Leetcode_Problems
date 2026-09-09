class Solution {
    public long countCommas(long n) {
        long num = 999;
        long count = 0;
        while(n > num){
            count += n-num;
            num = num*1000+999;
        }
        return count;
    }
}