class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        long left = 0;
        long right = (x/2)+1;
        if(right*right==x) return (int)right;
        while(right-left>1){
            long mid = (right+left)/2;
            if(mid*mid == x) return (int)mid;

            else if(mid*mid < x) left=mid;
            
            else right = mid;
            
        }
        return (int)left;
    }
}