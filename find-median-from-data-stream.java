class MedianFinder {
    PriorityQueue<Integer> smallWallet; 
    PriorityQueue<Integer> largeWallet;
    public MedianFinder() {
         smallWallet = new  PriorityQueue<Integer>((a,b)-> b - a);
         largeWallet = new PriorityQueue();
    }
    public void addNum(int num) {
        smallWallet.add(num);
        if(!largeWallet.isEmpty() && largeWallet.peek() < smallWallet.peek())
            largeWallet.add(smallWallet.poll());
        if(Math.abs(smallWallet.size()-largeWallet.size())>1){
            if(largeWallet.size()>smallWallet.size())
                smallWallet.add(largeWallet.poll());
            else{
                largeWallet.add(smallWallet.poll());
            }
        }  
    }
    
    public double findMedian() {
        if(largeWallet.size()>smallWallet.size())
            return largeWallet.peek() * 1.0;
        else if(largeWallet.size()<smallWallet.size()){
            return smallWallet.peek() * 1.0;
        }else{
            return (largeWallet.peek()+smallWallet.peek())/2.0;
        }
    }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
