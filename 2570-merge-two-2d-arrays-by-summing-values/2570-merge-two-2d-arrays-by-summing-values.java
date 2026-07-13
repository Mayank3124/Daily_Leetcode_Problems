class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i][0], nums1[i][1]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0], map.get(nums2[i][0])+nums2[i][1]);
            } else {
                map.put(nums2[i][0], nums2[i][1]);
            }
        }
        int [][] arr = new int [map.size()][2];
        int i = 0;
        for(int k : map.keySet()){
            arr[i][0] = k;
            arr[i][1] = map.get(k);
            i++;
        }
        return arr;
    }
}