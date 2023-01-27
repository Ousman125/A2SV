class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = arr.length; i>=1; i--){    
            int indx = search(i, arr);
            reverse(arr, 0, indx);
            if(indx!=0)list.add(indx+1);   
            reverse(arr, 0, i-1); 
            list.add(i);
        }
        return list;
    }
     int search(int no, int[]arr){  
        for(int i=0; i<arr.length ; i++){
            if(arr[i]==no) return i; 
        }  
        return arr.length;
    }   
     void reverse(int[] arr , int i , int j){
         while(i<j){
            int t= arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}
    
