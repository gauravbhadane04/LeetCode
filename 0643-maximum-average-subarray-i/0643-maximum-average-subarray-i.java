class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg = 0;
        int left = 0;
        double maxavg = Double.NEGATIVE_INFINITY;

        for(int right = 0; right < nums.length; right++){

            sum += nums[right];
        
            if(right - left + 1 == k){
                
                maxavg = Math.max(maxavg , (double)sum/k);

                sum -= nums[left];
                left++;
            }
        }

        return maxavg;
    }
}