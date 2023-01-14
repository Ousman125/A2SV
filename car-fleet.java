class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      cars[] car=new cars[position.length];
      for(int i=0;i<position.length;i++) 
      car[i]=new cars(position[i],speed[i]);
      Arrays.sort(car,(a,b)->a.position-b.position);
      Stack<Double> stk=new Stack();
      for(int i=position.length-1;i>=0;i--){
          double x= (double)(target-car[i].position)/car[i].speed;
          if(!stk.isEmpty() && x<=stk.peek()){
          continue;}
          stk.push(x);
      }
      return stk.size();
    }
}     class cars{
    int position,speed;
    public cars(int position,int speed){
     this.position=position;
     this.speed=speed;
    }
}
