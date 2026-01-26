class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int n=height.length;
        int w,h,area;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                w=j-i;
                if(height[i]<height[j]){
                    h=height[i];
                }else if(height[j]<height[i]){
                    h=height[j];
                }else{
                    h=height[i];
                }
                area=w*h;
               if(area>=maxwater){
                 maxwater=area;
               }
            }
        }
        return maxwater;
    }
}
public class waterContainer{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] height={1,8,6,2,5,4,8,3,7};
        int result = sol.maxArea(height);
        System.out.println("Maximum area: " +result);
    }
}