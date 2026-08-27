class Solution {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char str[] = s.toCharArray();

        while (l < r) {
            while(l < r && !isVowel(str[l])) l++;
            while(l < r && !isVowel(str[r])) r--;


            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;

        }
        return new String(str);
    }
}