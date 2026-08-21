class Solution {
    public String simplifyPath(String path) {
        String[] words = path.split("/");
        Deque<String> dq = new ArrayDeque<>();

        for(String str : words){
            if(str.length()==0 || str.equals(".")){
                continue;
            }else if (str.equals("..")){
                if(!dq.isEmpty()) dq.removeLast();
                continue;
            }
            dq.addLast(str);
        }

        StringBuilder str = new StringBuilder();

        while(!dq.isEmpty()){
            str.append('/');
            str.append(dq.pollFirst());
        }
        if(str.length()==0) return "/";

        return str.toString();

    }
}