class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea1=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int area = h*w;
            maxArea1 = Math.max(maxArea1,area);
            if(left<right){
                left++;
            }else{
                right--;
            }
        }
        return maxArea1;
    }
}
public class waterCont {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = sol.maxArea(height);
        System.out.println("Maximum Area: " +result);
    }
}
