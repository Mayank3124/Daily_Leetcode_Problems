class Solution {
    public int candy(int[] ratings) {
        int count = ratings.length;
        int decr = 0;
        int incr = 0;
        int check = Integer.MAX_VALUE;
        
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i]<ratings[i-1]){
                // if(incr!=0){
                //     decr--;
                // }
                decr++;
                if(check==decr) decr++;
                count += decr;
                incr=0;
            } 
            else if(ratings[i]==ratings[i-1]){
                incr=0;
                decr=0;
                check = Integer.MAX_VALUE;
            }
            else {
                
                incr++;
                count += incr;
                decr=-1;
                check = incr;
            }
        }
        return count;
        
    }
}