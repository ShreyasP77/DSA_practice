 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2)return findMedianSortedArrays(nums2,nums1);
        int lo = 0;
        int hi = n1;
        double ans=0.0;
            
        while(lo<=hi){
            int cut1 = (lo+hi)/2;
            int cut2 = (n1+n2+1)/2-cut1;
            int l1 = cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int r1 = cut1==n1?Integer.MAX_VALUE:nums1[cut1];
            int r2 = cut2==n2?Integer.MAX_VALUE:nums2[cut2];
            
            if(l1<=r2 && l2<=r1){
                    return (n1+n2)%2 == 0?((double)Math.max(l1,l2)+(double)Math.min(r1,r2))/2 :(double)Math.max(l1,l2);
            }
            else if(l2>r1) lo=cut1+1;
            else hi=cut1-1;
            
        
        }
     return ans;   
    }
