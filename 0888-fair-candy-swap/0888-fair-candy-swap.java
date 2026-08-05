class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> set = new HashSet<>();
        int aliceCandy = 0;
        int bobCandy = 0;
        for(int i = 0; i < aliceSizes.length; i++){
            aliceCandy += aliceSizes[i];
        }
        for(int j = 0; j < bobSizes.length; j++){
            set.add(bobSizes[j]);
            bobCandy += bobSizes[j];
        }
        int diff = (aliceCandy - bobCandy)/2;

        for(int i : aliceSizes){
            if(set.contains(i-diff)){
                return new int[]{i,i-diff};
            }
        }
        return new int[0];

        
    }
}