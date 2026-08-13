class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        String str = "";
        while(carry != 0 || m != 0 || n != 0 ){
            int sum = carry;
            if(m > 0 && a.charAt(--m)=='1') sum++;
            if(n > 0 && b.charAt(--n)=='1') sum++;

            if(sum==0 || sum==2){
                str = 0 + str;
            } else {
                str = 1 + str;
            }
            if(sum < 2) carry = 0;
            else carry = 1;

        }
        return str;
    }
}