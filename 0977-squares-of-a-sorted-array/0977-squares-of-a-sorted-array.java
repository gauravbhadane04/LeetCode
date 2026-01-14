class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int pos = nums.length-1;
        int[] arr = new int[nums.length];

        while(start <= end){
            int sq1 = nums[start] * nums[start];
            int sq2 = nums[end] * nums[end];

            if (sq2 >= sq1){
                arr[pos] = sq2;
                pos--;
                end--;

            }else{
                arr[pos] = sq1;
                pos--;
                start++;
            }
            
        }
        return arr;
    }
}