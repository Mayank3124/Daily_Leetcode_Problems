class Solution {
    public int smallestNumber(int n, int t) {
        
        int ans = 0;

        for(int i = n; i < n+t; i++ ){
            int temp = i;
            int pro = 1;
            while(temp!=0){
                int l = temp%10;
                pro *= l;
                if(pro%t==0){
                    return i;
                }
                
                
                temp /= 10;
            }
        }
        return n+t;
    }
}