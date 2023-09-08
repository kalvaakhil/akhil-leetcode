class Solution {
    public static List<Integer> generate1(int N){
        int ans=1;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<N;i++){
            ans=ans*(N-i);
            ans=ans/(i);
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int N) {
        List<List<Integer>> newlist=new ArrayList<>();
        for(int i=1;i<N+1;i++){
            newlist.add(generate1(i));
        }
        return newlist;
    }
}