class Solution {
    public int fib(int n) {
        if( n < 2 ) return n;
        int f1 = 1;
        int f0 = 0;
        for(int i = 2; i <= n; i++){
            f1 = f1 + f0;
            f0 = f1 - f0;
        }
        return f1;
    }
}