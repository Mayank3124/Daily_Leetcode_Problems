class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1 || num==0 ) return true;
        int l = 0;
        int r = num/2;

        while(l<=r){
            int mid = l + (r - l)/2;
            long sqr = (long)mid*mid ;
            if(sqr < num){
                l = mid + 1;
            }else if(sqr > num){
                r = mid - 1;
            }else {
                return true;
            }
            
        }
        return false;

    }
}