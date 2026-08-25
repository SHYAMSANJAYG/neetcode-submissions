class Solution {
    private int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int val : piles) {
            max = Math.max(max, val);
        }
        return max;
    }

    private long calculateTotalHours(int[] piles, int speed) {
        long totalH = 0;
        for (int bananas : piles) {
            totalH += (bananas + speed - 1) / speed; 
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalH = calculateTotalHours(piles, mid);

            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
