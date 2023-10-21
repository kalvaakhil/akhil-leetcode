class Solution {
   public long maximumSum(List<Integer> A) {
        Map<Long, Long> count = new HashMap<>();
        long res = 0, x, v;
        for (int i = 0; i < A.size(); i++) {
            for (x = i + 1, v = 2; v * v <= x; v++)
                while (x % (v * v) == 0)
                    x /= v * v;
            res = Math.max(res, count.merge(x, (long)A.get(i), Long::sum));
        }
        return res;
    }
}