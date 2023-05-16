class Solution {
  public int[] circularGameLosers(int n, int k) {
    var map = new boolean[n];
    int x = 0, i;
    
    for (i=1; !map[x]; i++) {
      map[x] = true;
      x = (x + i*k) % n;
    }
    var ans = new int[n-i+1];
    var j = 0;

    for (i=0; i<n; i++)
      if (!map[i])
        ans[j++] = i+1;

    return ans;
  }
}