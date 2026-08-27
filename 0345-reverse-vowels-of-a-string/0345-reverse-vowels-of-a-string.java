class Solution {
    public boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' );
    }
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() -1;
        char str[] = s.toCharArray(); 

        while(l < r){
            if(isVowel(str[l]) && isVowel(str[r])){
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp; 
                l++;
                r--;
            }else if(!isVowel(str[l])) l++;
            else if(!isVowel(str[r])) r--;
        }
        return new String(str);
    }
}