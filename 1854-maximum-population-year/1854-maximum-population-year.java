class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] freq = new int[101];

        for(int[] log : logs){
            freq[log[0]-1950]++;
            freq[log[1]-1950]--;
        }
        int idx = 0;
        int max = freq[0];
        for(int i = 1; i < 101; i++){
            freq[i] = freq[i]+freq[i-1];
            if(freq[i] > max){
                max = freq[i];
                idx = i;
            }
        }
        return 1950 + idx;

    }
}