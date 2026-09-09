class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] freq = new int[52];

        for(int[] range : ranges){
            freq[range[0]]++;
            freq[range[1]+1]--;
        }

        for(int i = 1; i < 51; i++){
            freq[i] = freq[i-1]+freq[i];
            if(i==left && freq[i]!=0){
                left ++;
            }
        }
        return left > right;

    }
}