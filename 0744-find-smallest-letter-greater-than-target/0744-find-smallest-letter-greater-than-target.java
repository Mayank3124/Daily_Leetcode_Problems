class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0; 
        int r = letters.length;
        while(l < r){
            int m = l + (r - l)/2;
            if(letters[m]-target <= 0){
                l = m+1;
            }else r = m;
        }
        return letters[l%letters.length];

    }
}