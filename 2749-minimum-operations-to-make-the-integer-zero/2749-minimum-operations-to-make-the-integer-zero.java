class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int k = 0;
        long n = num1;
        while (n > 0) 
        {
            n -= num2;
            if (Long.bitCount(n) <= ++k && k <= n) 
            {
                return k;
            }
        }
        return -1;
    }
}