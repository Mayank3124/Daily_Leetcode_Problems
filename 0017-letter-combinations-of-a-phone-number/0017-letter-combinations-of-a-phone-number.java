class Solution {
    public void Helper(String s, String digits, int idx, String[] map, List list){
        if(s.length() == digits.length()) {
            list.add(s);
            return;
        }
        String str = map[digits.charAt(idx)-'0'];
        for(char ch : str.toCharArray()){
            Helper(s+ch,digits,idx+1,map,list);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<String> list = new ArrayList<>();

        Helper("",digits,0,map,list);
        return list;
        
    }
}