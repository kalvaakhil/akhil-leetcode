class Solution {
    public long minimumPossibleSum(int n, int target) {
        HashSet<Integer> hset=new HashSet<>();
        int i=1;
        while(hset.size()<n){
            if(hset.contains(target-i)==false){
                hset.add(i);
            }
            i++;
        }
        long s=0;
        
        for(int j:hset){
            // System.out.println(j);
            s+=j;
        }
        return s;
    }
}