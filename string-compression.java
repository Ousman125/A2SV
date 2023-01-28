class Solution {
    public int compress(char[] chars) {
        int newindex=0; 
        for(int i=0; i<chars.length; i++){
            Integer count=1; 
            while( i<chars.length-1 && chars[i]==chars[i+1]){   
                count++;
                i++;
            }
            chars[newindex] = chars[i];
            newindex++;
            if(count>1){
                for(char ch: Integer.toString(count).toCharArray()){ 
                    chars[newindex] = ch;
                    newindex++;
                }
            }
        }
        return newindex;
    }
}
