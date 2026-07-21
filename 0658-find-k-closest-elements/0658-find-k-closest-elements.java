// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(
//                 (a, b) -> {
//                     if (Math.abs(x - a) != Math.abs(x - b)) {
//                         return Math.abs(x - a) - Math.abs(x - b);
//                     }
//                     return a - b;
//                 });
//         for (int i : arr) {
//             pq.add(i);
   
//         }
//         List<Integer> list = new ArrayList<>();
//         PriorityQueue<Integer> pq2 = new PriorityQueue<>();
//         while (k-- > 0) {
//             pq2.offer(pq.poll());
//         }
//         while (!pq2.isEmpty()) {
//             list.add(pq2.poll());
//         }
//         return list;

//     }
// }

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (Math.abs(x - a) != Math.abs(x - b))
                    return Math.abs(x - b) - Math.abs(x - a);
                return b - a;
            });

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k)
                pq.poll();
        }

        List<Integer> ans = new ArrayList<>(pq);
        Collections.sort(ans);
        return ans;
    }
}