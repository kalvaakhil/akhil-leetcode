class Solution {
    long MOD = (long)(1e9 + 7);
    
    public int countVowelPermutation(int n) {
        long[][] memo = new long[n + 1][6];
        for (long[] row : memo) Arrays.fill(row, -1);
        return (int)findPerm(n, 0, memo);
    }
    
    private long findPerm(int len, int last, long[][] memo) {
        if (len == 0)
            return 1;

        if (memo[len][last] != -1)
            return memo[len][last];

        long count = 0;
        if (last == 2)
            count = (count + findPerm(len - 1, 1, memo)) % MOD;
        if (last == 1 || last == 3)
            count = (count + findPerm(len - 1, 2, memo)) % MOD;
        if (last != 0 && last != 3)
            count = (count + findPerm(len - 1, 3, memo)) % MOD;
        if (last == 3 || last == 5)
            count = (count + findPerm(len - 1, 4, memo)) % MOD;
        if (last == 1)
            count = (count + findPerm(len - 1, 5, memo)) % MOD;
        if (last == 0)
            for (int i = 1; i <= 5; i++)
                count = (count + findPerm(len - 1, i, memo)) % MOD;

        return memo[len][last] = count % MOD;
    }
}