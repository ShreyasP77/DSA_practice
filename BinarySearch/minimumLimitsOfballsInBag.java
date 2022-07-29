// Yet another variant of bkAllocation Problem
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        
            int min = 1, max = 0, res = -1;
            for(int e:nums){
                    max = Math.max(max,e);
                    
            }
            while(min<=max){
                    int mid = min + (max-min)/2;
                    if(isFeasible(nums,maxOperations,mid)){
                            res = mid;
                            max = mid-1;
                    }else{
                            min = mid+1;
                    }
            }
        return res;
    }
    public boolean isFeasible(int a[],int k, int minPenalty){
            int operations = 0;
            for(int i=0; i<a.length; i++){
                    
                    if(a[i]>minPenalty){
                            operations += a[i]/minPenalty;// divided to get total no. of operations needed to perform such that to make penalty minimum.
                            if(a[i]%minPenalty==0){
                                    operations--;
                            }
                    }
            }
            return operations<=k;
    }
}
