// import java.util.* ;
// import java.io.*; 
// import java.util.ArrayList;
// import java.util.HashMap; 

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
//     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         int count = 1;
        
//         for(int i = 0; i<n ; i++){
//             if(map.containsKey(arr.get(i))){
//   map.merge(arr.get(i), count, (oldValue, newValue) -> oldValue + newValue);
//             }else{
//                 map.put(arr.get(i),count);
//             }
//         }
//         int integerVal = -1;
//         for (Integer i : map.keySet()) {
//             if(map.get(i) >1){
//              integerVal = i;
//             }

//         }
//         return integerVal;


// Optimal Approach

   int[] arr = nums;
          int n = arr.length;
//         aux array
        int freq[] = new int[n + 1];
        
        
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }
}
