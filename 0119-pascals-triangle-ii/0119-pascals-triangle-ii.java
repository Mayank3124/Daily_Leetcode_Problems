class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if(rowIndex == 0) return list;
        list.add(1);
        if(rowIndex == 1) return list;

        for(int i = 2; i <= rowIndex; i++){
            List<Integer> List1 = new ArrayList<>();
            List1.add(1);
            for(int j = 0; j < list.size()-1; j++){
                List1.add(list.get(j)+list.get(j+1));

            }
            List1.add(1);
            list = List1;
        }

        return list;
        
    }
}