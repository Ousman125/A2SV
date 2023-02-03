class KthLargest {
  int k; Queue<Integer> min=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
		for (int x: nums) {
			min.add(x);
			if (min.size() > k) {
				min.poll();
			}
		}
    }  
    public int add(int val) {
          min.add(val);
		if (min.size() > k) {
			min.poll();
		}
		return min.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
