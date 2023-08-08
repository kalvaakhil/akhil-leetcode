class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> hs=new HashSet<>();
        for(int i:nums )
            hs.add(Long.valueOf(i));
        int res=0;
        for(int i:nums){
            long n=i;int c=1;
            while(hs.contains(n*n)){
                c++;
                n*=n;
            }
            res=Math.max(res,c);
        }
        return res>1?res:-1;
    }
}
// class Solution {
//     public int longestSquareStreak(int[] nums) {
//         Set<Long> set = new HashSet<>();

//         for(int i: nums) set.add(Long.valueOf(i));

//         int max = 0;
//         for(int i: nums) {
//             int cnt = 1;
//             long num = i;

//             while(set.contains(num*num)) {
//                 num = num*num;
//                 cnt++;
//             }

//             max = Math.max(max, cnt);
//         }

//         return max == 1 ? -1: max;
//     }
// }