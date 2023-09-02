class Solution {
    public int minimumFinishTime(int[][] tires, int changeTime, int numLaps) {
        int[] minTime = new int[numLaps + 1];
        Arrays.fill(minTime, Integer.MAX_VALUE);
        for (int[] tire : tires) {
            checkMinTime(tire, minTime, changeTime, numLaps);
        }
        for (int i = 2; i <= numLaps; i++) {
            for (int j = 1; j < i; j++) {
                int remain = i % j;
                int currMin;
				// Greedy, in order to get the minimal runtime, we should repeat the same loop as much as possible.
                if (remain != 0) {
                    currMin = (i / j) * (minTime[j] + changeTime) + minTime[remain];
                } else {
					// The last changeTime is not required if remain is 0
                    currMin = (i / j) * (minTime[j] + changeTime) - changeTime; 
                }
                minTime[i] = Math.min(minTime[i], currMin);
            }
        }

        return minTime[numLaps];
    }
    
    private void checkMinTime(int[] tire, int[] minTime, int changeTime, int numLaps) {
        int base = tire[0];
        int lap = 1;
        int curr = base;
        minTime[lap] = Math.min(minTime[lap], curr);
        int sum = base;
		// Greedy, if changeTime + base is smaller, the minimal runtime for the next lap
		// will not be better than minTime[lap - 1] + changeTime + minTime[1] 
        while (curr * tire[1] - base <= changeTime && lap++ < numLaps) {
            curr *= tire[1];
            sum += curr;
            minTime[lap] = Math.min(minTime[lap], sum);
        }
    }
}