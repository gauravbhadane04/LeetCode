class Solution {
    public int maxArea(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;
        int maxarea = 0;
        while(left < right){

            int length = Math.min(nums[left],nums[right]);
            int breadth = right - left ;

            maxarea = Math.max(maxarea, length*breadth);

            if(nums[left] < nums[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxarea;
    }
}