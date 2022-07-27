// Yet another variant of book allocation problem (allocate minimum pages).
class Solution {
    public int shipWithinDays(int[] weights, int days) {
            int min = 0, max = 0, res = 0;
            for(int e:weights){
                    min = Math.max(min,e);
                    max+=e;
            }
            while(min<=max){
                    int mid = min + (max-min)/2;
                    if(isFeasible(weights,days,mid)){
                            res = mid;
                            max = mid-1;
                    }else{
                            min = mid+1;
                    }
            }
        return res;
    }
    public boolean isFeasible(int a[],int k, int res){
            int student = 1, sum = 0;
            for(int i=0; i<a.length; i++){
                    if(sum+a[i]>res){
                            student++;
                            sum = a[i];
                    }else sum+=a[i];
            }
            return student<=k;
    }
        
}
