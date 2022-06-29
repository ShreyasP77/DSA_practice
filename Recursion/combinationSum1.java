class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combi(candidates,target,ans,ds,0);
        return ans;
    }
    public static void combi(int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds, int idx){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[idx]<=target){
            ds.add(candidates[idx]);
//           Add but do not move from the index
            combi(candidates,target-candidates[idx],ans,ds,idx);
            ds.remove(ds.size()-1);
            
        }
//       Do not add and move to next index
        combi(candidates,target,ans,ds,idx+1);
    }
}
