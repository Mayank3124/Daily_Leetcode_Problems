class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        StringBuilder str = new StringBuilder();
        while(carry != 0 || m != 0 || n != 0 ){
            
            if(m > 0 && a.charAt(--m)=='1') carry++;
            if(n > 0 && b.charAt(--n)=='1') carry++;

            str = str.append(carry%2);
            carry = carry/2 ;
            

        }
        return str.reverse().toString();
    }
}