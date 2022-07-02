// For Unsorted array.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums = [3,2,4], target = 6
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int i = 0;
                                //        0 1
        int[] arr = new int[2]; // arr = [_,_]
        
        while(i<nums.length){
            
            if(map.containsKey(target-nums[i])){ 
                arr[1] = i;
                arr[0] = map.get(target-nums[i]);
                return arr;
                    
            }
//                      Key     Value
//            map =>   nums[i] |  i
//                       3     |  0   i++
//            Check if map.contains(6-2=4) No
//                       2     |  1   i++
//            Check if map.contains(6-4=2) Yes we already have this entry stored in map.
//                  arr [ 0 1 ]
//                      [ 1 2 ] return arr
    
            map.put(nums[i],i);
            i++;
        }
        return arr;
    }
  
  
  
