class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        int del=0;
        HashSet<Integer> hset=new HashSet<>();
        for(Character i:hmap.keySet()){
            int f=hmap.get(i);
            while(f>0 && hset.contains(f)){
                f-=1;
                del++;
            }
            hset.add(f);
        }
        return del;
    }
}