    public int subarraySum(int[] nums, int k) {
       
       int sum=0;
       int count=0;
        HashMap<Integer,Integer>map=new HashMap<>(); 
        map.put(0,1);
        int i=0;
        
//         nums =   1 2 3
                  
//     Explanation    
//   map => sum =  0 1 3 6
//                 1 1 1 1
//   sum-k=> 3-3=0
//           6-3=3
//   count=> 1+1
        while(i<nums.length){
            sum+=nums[i];
             if(map.containsKey(sum-k))
                count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
            
            i++;
        }
        return count;
    }
