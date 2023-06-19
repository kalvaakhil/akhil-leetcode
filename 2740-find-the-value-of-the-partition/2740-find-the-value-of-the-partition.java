class Solution {
    public int findValueOfPartition(int[] A) {
        Arrays.sort(A);
        int res = A[1] - A[0], n = A.length;
        for (int i = 2; i < n; i++)
            res = Math.min(res, A[i] - A[i - 1]);
        return res;
    }
}