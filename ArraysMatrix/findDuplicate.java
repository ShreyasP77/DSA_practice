public List<Integer> findDuplicates(int[] nums) {
        // Optimal Approach
    List<Integer> list = new ArrayList<>();
        // nums = [4,3,2,7,8,2,3,1]
          int n = nums.length;
        // aux array
        int freq[] = new int[n + 1];
        
        // -->
//         i                0   1   2   3   4   5   6   7
              
//         nums[i]          4
//         freq[nums[i]]    0   0   0   0   1   0   0   0   0
              
//         nums[i]          4   3
//         freq[nums[i]]    0   0   0   1   1   0   0   0   0
              
//         nums[i]          4   3   2    
//         freq[nums[i]]    0   0   1   1   1   0   0   0   0

//         nums[i]          4   3   2   7 
//         freq[nums[i]]    0   0   1   1   1   0   0   1   0
              
//         nums[i]          4   3   2   7   8
//         freq[nums[i]]    0   0   1   1   1   0   0   1   1
              
//         nums[i]          4   3   2   7   8   2
//         freq[nums[i]]    0   0   2   1   1   0   0   1   1
              
//         nums[i]          4   3   2   7   8   2   3
//         freq[nums[i]]    0   0   2   2   1   0   0   1   1
              
//         nums[i]          4   3   2   7   8   2   3   1
//         freq[nums[i]]    0   1   2   2   1   0   0   1   1
        for (int i = 0; i < n; i++) {
            
                freq[nums[i]] += 1;
           
        }
        
        //         0   1   2   3   4   5   6   7   8
        // freq = [0   1   2   2   1   0   0   1   1]
        //             list.add(2)
        //             list.add(3)
        
         for (int i = 0; i < n+1; i++) {
            if(freq[i]>1){
                list.add(i);}
           
        }
        if(list.isEmpty()) list.add(-1);

        return list;
}




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
