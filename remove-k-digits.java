class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<num.length();i++){
           char ch=num.charAt(i);
            while(!dq.isEmpty() && dq.peekLast()>ch && k>0){
                dq.pollLast();
                k--;
            }
          dq.add(ch);
        }
        while(k-->0)
        dq.pollLast();
        String ans="";
        while(!dq.isEmpty())
        ans+=dq.poll();
        while(ans.length()>1 && ans.charAt(0)=='0') ans=ans.substring(1);
        if(ans=="") return "0";
        return ans;
    }
}
