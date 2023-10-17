class Solution {
    public int[] findIndices(int[] v, int index, int value) {
        int n = v.length;
        int[] maxValues = new int[n];
        int[] minValues = new int[n];
        int[] ans = new int[]{-1, -1};

        maxValues[n - 1] = v[n - 1];
        minValues[n - 1] = v[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxValues[i] = Math.max(v[i], maxValues[i + 1]);
            minValues[i] = Math.min(v[i], minValues[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int j = i + index;
            if (j < n && (Math.abs(v[i] - maxValues[j]) >= value || Math.abs(v[i] - minValues[j]) >= value)) {
                ans[0] = i;
                for (int k = j; k < n; k++) {
                    if (Math.abs(v[i] - v[k]) >= value) {
                        ans[1] = k;
                        break;
                    }
                }
                break;
            }
        }

        return ans;
    }
}