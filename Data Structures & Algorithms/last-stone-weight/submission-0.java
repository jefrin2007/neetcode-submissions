class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
      for(int stone : stones){
        heap.add(stone);
      }
      while(heap.size()>1){
        int ft = heap.poll();
        int sd = heap.poll();
        if(ft != sd){
            heap.offer(ft - sd);
        }
      }
      if(heap.size() == 0){
        return 0;
      }
      return heap.peek();
    }
}
