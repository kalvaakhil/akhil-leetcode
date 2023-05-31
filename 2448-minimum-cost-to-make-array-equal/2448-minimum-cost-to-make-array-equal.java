class Solution {
public long minCost(int arr[], int cos[]) {
	int low = Integer.MAX_VALUE;
	int high = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
		low = Integer.min(low, arr[i]);
		high = Integer.max(high, arr[i]);
	}

	while ((high - low) >= 3) {
		int mid1 = low + (high - low) / 3;
		int mid2 = high - (high - low) / 3;
		if (computeCost(arr, cos, mid1) < computeCost(arr, cos, mid2)) {
			high = mid2;
		} else {
			low = mid1;
		}
	}

	long res = computeCost(arr, cos, low);
	for (int i = low + 1; i <= high; i++) {
		res = Long.min(res, computeCost(arr, cos, i));
	}
	return res;
}

long computeCost(int arr[], int cos[], int X) {
	long cost = 0;
	for (int i = 0; i < arr.length; i++) {
		cost += Math.abs(arr[i] - X) * ((long)cos[i]);
	}
	return cost;
}
}