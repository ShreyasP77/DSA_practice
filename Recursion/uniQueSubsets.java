class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
         List<List<Integer>> ansList = new ArrayList<>(); 
        subSets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
    public static void subSets( int idx, int[] nums, List<Integer>ds, List<List<Integer>> ansList){
        
        ansList.add(new ArrayList<>(ds));//Adding every ds array as a element to ansList.
        for(int i=idx; i<nums.length; i++){
            if(i>idx && nums[i]==nums[i-1]) continue;//Do not add duplicate element.
            ds.add(nums[i]);
            subSets(i+1, nums,ds, ansList);
            ds.remove(ds.size()-1);//backtrack to empty the ds array so as to feed in new values.
            
                
        }
    }
     
}
