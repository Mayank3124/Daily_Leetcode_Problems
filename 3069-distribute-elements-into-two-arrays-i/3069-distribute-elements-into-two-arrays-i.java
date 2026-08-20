class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        arr1[0] = nums[0];
        int n1 = 1;
        int[] arr2 = new int[nums.length];
        arr2[0] = nums[1];
        int n2 = 1;

        for(int i = 2; i < nums.length; i++){
            if(arr1[n1-1] > arr2[n2-1]){
                arr1[n1] = nums[i];
                n1++;
            }
            else {
                arr2[n2] = nums[i];
                n2++;
            }
        }
        n2 = 0;

        for(int i = n1; i < nums.length; i++){
            arr1[i] = arr2[n2];
            n2++;
        }
        return arr1;
    }
}