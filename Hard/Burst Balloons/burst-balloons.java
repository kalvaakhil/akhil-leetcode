//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int memoizationUtil(int[] nums, int left, int right, int[][] dp) {
		if (left == right) {
			return 0;
		}
		if (dp[left][right] != -1) {
			return dp[left][right];
		}
		dp[left][right] = Integer.MIN_VALUE;
		for (int k = left; k < right; k++) {
			dp[left][right] = Math.max(dp[left][right], memoizationUtil(nums, left, k, dp)
					+ memoizationUtil(nums, k + 1, right, dp) + nums[left - 1] * nums[k] * nums[right]);
		}
		return dp[left][right];
	}

	static int memoization(int[] arr) {
		int[] nums = new int[arr.length + 2];
		nums[0] = nums[arr.length + 1] = 1;
		for (int i = 0; i < arr.length; i++) {
			nums[i + 1] = arr[i];
		}
		int[][] dp = new int[nums.length + 1][nums.length + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		return memoizationUtil(nums, 1, nums.length - 1, dp);
	}

	static int tabulation(int nums[], int n) {
		int table[][] = new int[n][n];
		for (int L = 2; L < n; L++) {
			for (int i = 1; i < n - L + 1; i++) {
				int j = i + L - 1;
				if (j == n) {
					continue;
				}
				table[i][j] = Integer.MIN_VALUE;
				for (int k = i; k < j; k++) {
					table[i][j] = Math.max(table[i][j],
							table[i][k] + table[k + 1][j] + nums[i - 1] * nums[k] * nums[j]);
				}
			}
		}
		return table[1][n - 1];
	}

	static int tabulation(int arr[]) {
		int[] nums = new int[arr.length + 2];
		nums[0] = nums[arr.length + 1] = 1;
		for (int i = 0; i < arr.length; i++) {
			nums[i + 1] = arr[i];
		}
		return tabulation(nums, nums.length);
	}
	
    public static int maxCoins(int N, int[] arr)
    {
        return tabulation(arr);
        // return memoization(arr);
    }
}

     