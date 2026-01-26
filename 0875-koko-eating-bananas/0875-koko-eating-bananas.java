class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEatAll(piles, h, mid)) {
                answer = mid;
                high = mid - 1;   // try smaller speed
            } else {
                low = mid + 1;    // need faster speed
            }
        }

        return answer;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceiling division
        }

        return hours <= h;
    }
}
