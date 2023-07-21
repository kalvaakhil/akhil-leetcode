class Solution {
  private static final int modulo = (int) 1e9 + 7;

  public int numberOfGoodSubarraySplits(int[] nums) {
    final int n = nums.length;
    long count = 0;

    // find the first one
    int i = 0;
    while (i < n && nums[i] != 1) {
      i++;
    }

    if (i < n) {
      count++;
    }

    for (int j = i + 1; j < n; j++) {
      while (j < n && nums[j] == 0) {
        j++;
      }

      if (j < n && nums[j] == 1) {
        // we have j - i cuts with zero between two one(i, j)
        // 10...01
        // i ... j
        count = count * (j - i) % modulo;
        i = j;
      }
    }

    return (int) count;
  }
}
