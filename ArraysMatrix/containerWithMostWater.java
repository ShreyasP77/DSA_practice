 public int maxArea(int[] height) {
        
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        int heightAct = 0;
        int distance = 0;
//                  0,1,2,3,4,5,6,7,8
//        height = [1,8,6,2,5,4,8,3,7] 
        
//         Dry Run - Explanation
        
//         area = distance*actualHeight
        
//         l    r   distance    height[l]       height[r]   heightActual    area    maxArea
//         0    8   8           1           <   7           1               8       8       //l++
//         1    8   7           8           >   7           7               49      49      //r--
//         1    7   6           8           >   3           3               18      49      //r--
//         1    6   5           8           =   8           8               40      49      //r--
//         1    5   4           8           >   4           4               24      49      //r--
//         1    4   3           8           >   5           5               15      49      //r--
//         1    3   2           8           >   2           2               4       49      //r--
//         1    2   1           8           >   6           6               6       49      //r--
        
//         1    1   <--- end of loop
        
        while(l<r){
//             Picking smaller height because according to smaller height the water will be stored.
            heightAct = Math.min(height[l],height[r]);
            distance = r-l;
            int area = heightAct*distance;
            maxArea = Math.max(area,maxArea);
            if(height[l]<height[r]) l++;
            else r--;
        }
       return maxArea; 
    }
