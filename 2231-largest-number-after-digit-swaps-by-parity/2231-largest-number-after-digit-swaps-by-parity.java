class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> pqEven = new PriorityQueue<>(Collections.reverseOrder()); 
        PriorityQueue<Integer> pqOdd = new PriorityQueue<>(Collections.reverseOrder()); 

        ArrayList<Integer> list = new ArrayList<>();
        while(num!=0){
            int digit = num%10;
            if(digit%2!=0){
                pqOdd.offer(digit);
                list.add(0,1);
            } else {
                pqEven.offer(digit);
                list.add(0,0);
            }
            num = num/10;
            
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)==1){
                num = num*10 + pqOdd.poll();
            } else {
                num = num*10 + pqEven.poll();
            }
        }
        return num;
    }
}