class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
            HashSet<Integer> set = new HashSet<>();
            int count = 0;
            for(int i=arr.length-1;i>=0;i--){
                    set.add(arr[i]);
            }
        
            for(int i=0; i<arr.length;i++){
         if(set.contains(arr[i]+diff) && set.contains(arr[i]+2*diff)){
               count++;
         }}
            return count;
    }
}
