class Solution {
    public int hIndex(int[] citations) {
        int l = 0, r = citations.length;
        while(l < r){
            int mid = l + (r-l)/2;
            if(citations[mid]>=(citations.length-mid)){
                r = mid ;
            }else {
                l = mid + 1;
            }
        }
        return (citations.length - r);
    }
}