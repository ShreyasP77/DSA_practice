class Solution {
        public int mySqrt(int x) {
                int ans = 0;
                int l = 1 ,r = x;
                while(l<=r){
                        long mid = l+(r-l)/2;
                        long midSq = mid*mid;
                        if(midSq == x) return (int)mid;
                        else if(midSq > x) r = (int)mid-1;
                        else{
                                ans = (int)mid;
                                l = (int)mid+1;
                        }
                }
            
       return ans; 
    }
//         BRUTE FORCE
    // public int mySqrt(int x) {
    //         if(x==0)return 0;
    //         for(int i=1;i<=x/i;i++){
    //                 if(i<=x/i && (i+1)>x/(i+1)) // similar to calculating i*i < = x
    //                         return i;
    //         }
    //    return -1; 
    // }
}
