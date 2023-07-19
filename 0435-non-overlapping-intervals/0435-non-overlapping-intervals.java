class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        int res = 0, i = 1;
        while(i <intervals.length){
            if(intervals[i][0] == intervals[i - 1][0]){
                res++;
                intervals[i][1] = intervals[i][1] < intervals[i - 1][1]? intervals[i][1]:intervals[i - 1][1];
            }
            else if(intervals[i][0] < intervals[i - 1][1]){
                res++;
                intervals[i][0] = intervals[i][1] <= intervals[i - 1][1] ? intervals[i][0] : intervals[i - 1][0];
                intervals[i][1] = intervals[i][1] <= intervals[i - 1][1] ? intervals[i][1] : intervals[i - 1][1];
            }
            i++;
        }
        return res;
    }
}