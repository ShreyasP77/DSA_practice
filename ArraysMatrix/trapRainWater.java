package Arrays;

public class TrapWater {
    public static int trap(int[] height) {
        int leftMax=0;
        int rightMax=0;
        int l=0,r=height.length-1;

        int ans=0;
        while(l<r){
            if(height[l]<=height[r]){
                System.out.println("------lh<rh------");
                if(height[l]>leftMax){
                    System.out.println("------lh------");
                    leftMax = height[l];}
                else {System.out.println("------anslh------");
                    ans += (leftMax - height[l]);
                }
                l++;
            }else{System.out.println("------lh>rh------");
                if(height[r]>rightMax){System.out.println("------rh------");
                    rightMax = height[r];}
                else {System.out.println("------ansrh------");
                    ans += (rightMax - height[r]);
                }
                r--;
            }
            System.out.println(leftMax+"  "+rightMax+"  "+ans);
        }
        return ans;


    }
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
// 
// 
// 
// 
// OutPut
// ------lh<rh------
// ------anslh------
// 0  0  0
// ------lh<rh------
// ------lh------
// 1  0  0
// ------lh<rh------
// ------anslh------
// 1  0  1
// ------lh>rh------
// ------rh------
// 1  1  1
// ------lh<rh------
// ------lh------
// 2  1  1
// ------lh<rh------
// ------anslh------
// 2  1  2
// ------lh<rh------
// ------anslh------
// 2  1  4
// ------lh<rh------
// ------anslh------
// 2  1  5
// ------lh>rh------
// ------rh------
// 2  2  5
// ------lh>rh------
// ------ansrh------
// 2  2  6
// ------lh>rh------
// ------ansrh------
// 2  2  6
// 6


