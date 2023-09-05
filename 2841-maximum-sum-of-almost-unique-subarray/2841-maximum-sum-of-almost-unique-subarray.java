class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long ans=0, unqSoFar=0, sumSoFar=0;
        Map<Integer, Integer> map = new HashMap<>();
        int idxBeforeWindow=0;
        for(int i=0; i<nums.size(); i++) {
            int num = nums.get(i);
            sumSoFar += num;
            int freq = map.getOrDefault(num, 0);
            freq++;
            map.put(num, freq);
            if(freq == 1) {
                unqSoFar++;
            }
            // have we taken k elements already?
            if(i>=k) {
                // remove windowStart element from sum
                int numBfrWindow = nums.get(idxBeforeWindow);
                sumSoFar -= numBfrWindow;
                int f = map.getOrDefault(numBfrWindow, 0);
                // decrement the frequency as it is out of the window
                f--;
                map.put(numBfrWindow, f);
                // if frequency is 0, we no longer have this number
                // available to our current window.
                // Therefore, decrement the unqSoFar count.
                if(f == 0) {
                    unqSoFar--;
                }
                // as we move to the right, 
                // our index before active window should be incremented.
                idxBeforeWindow++;
            }
            // if we found at least m uniques consider the sumSoFar
            if(unqSoFar >= m){
                ans = Math.max(ans, sumSoFar);
            }
        }
        return ans;
    }
}