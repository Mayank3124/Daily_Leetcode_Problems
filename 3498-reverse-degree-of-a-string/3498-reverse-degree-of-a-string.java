class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int i = 1;
        for(char ch : s.toCharArray()){
            sum += (('z' - ch ) + 1)*i;
            i++; 
        }
        return sum;
    }
}