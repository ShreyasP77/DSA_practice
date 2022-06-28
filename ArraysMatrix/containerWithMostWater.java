class Solution {
    public int maxArea(int[] height) {
        
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        int heightAct = 0;
        int distance = 0;
        while(l<r){
            heightAct = Math.min(height[l],height[r]);
            distance = r-l;
            int area = heightAct*distance;
            maxArea = Math.max(area,maxArea);
            if(height[l]<height[r]) l++;
            else r--;
        }
       return maxArea; 
    }
}
