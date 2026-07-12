class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int left = 0;
        int right = (x/2)+1;
        if(right*right==x) return right;
        while(right-left>1){
            long mid = (right+left)/2;
            if(mid*mid == x) return (int)mid;

            else if(mid*mid < x) left=(int)mid;
            
            else right = (int)mid;
            System.out.println(mid);
        }
        return left;
    }
}