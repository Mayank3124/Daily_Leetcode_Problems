class Solution {
    public void Helper(String s, String digits, int idx, HashMap map, List list){
        if(s.length() == digits.length()) {
            list.add(s);
            return;
        }
        String str = map.get(digits.charAt(idx)).toString();
        for(char ch : str.toCharArray()){
            Helper(s+ch,digits,idx+1,map,list);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> list = new ArrayList<>();

        Helper("",digits,0,map,list);
        return list;
        
    }
}