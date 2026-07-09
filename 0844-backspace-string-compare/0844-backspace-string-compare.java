class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sr = new StringBuilder("");
        StringBuilder tr = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='#'){
                if(sr.length()>0) sr.deleteCharAt(sr.length()-1);
            } else {
                sr.append(s.charAt(i));
            }
        }
        System.out.println(sr);
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i)=='#'){
                if(tr.length()>0) tr.deleteCharAt(tr.length()-1);
            } else {
                tr.append(t.charAt(i));
            }
        }
        
        
        return (sr.compareTo(tr)==0);
        
    }
}