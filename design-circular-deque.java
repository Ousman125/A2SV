class MyCircularDeque {
     Deque<Integer>   MyCircularDeque;
     int size;
    public MyCircularDeque(int k) {
        MyCircularDeque = new ArrayDeque<Integer>(k);
        size=k;
    }
    public boolean insertFront(int value) {
        if( MyCircularDeque.size()==size)
        return false;
        else
        MyCircularDeque.addFirst(value);
          return true;
    }
    public boolean insertLast(int value) {
         if( MyCircularDeque.size()==size)
        return false;
        else
        MyCircularDeque.addLast(value);
        return true;
    }
    public boolean deleteFront() {
         if( MyCircularDeque.isEmpty())
        return false;
        else
        MyCircularDeque.removeFirst();
        return true;
    }
    public boolean deleteLast() {
        if( MyCircularDeque.isEmpty())
        return false;
        else
        MyCircularDeque.removeLast();
        return true;
    }
    public int getFront() {
         if( MyCircularDeque.isEmpty())
        return -1;
        else
        return MyCircularDeque.getFirst();
    }
    
    public int getRear() {
         if( MyCircularDeque.isEmpty())
        return -1;
        else
       return MyCircularDeque.getLast(); 
    }
    public boolean isEmpty() {
        return MyCircularDeque.isEmpty();
    }
    public boolean isFull() {
        if( MyCircularDeque.size()==size)
        return true;
        else
        return false;
    }
}
