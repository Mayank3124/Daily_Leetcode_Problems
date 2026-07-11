class Solution {
    public String convert(String s, int numRows) {
        if(1==numRows) return s;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < numRows; i++){
            int j = i;
            while(j < s.length()){
                if(i==0 || i == numRows-1){
                    str.append(s.charAt(j));
                    j += (numRows-1)*2;
                }
                else{
                    str.append(s.charAt(j));
                    j += (numRows-1-i)*2;
                    if(j<s.length()) str.append(s.charAt(j));
                    j += i*2;
                }

            }
        }
        return str.toString();
        
    }
}