class Solution {
     boolean a[];
    public boolean isprime(int n){
       a=new boolean[n+1];
        Arrays.fill(a,true);
        a[0]=false;
        a[1]=false;
        for(int i=2;i*i<=n;i++){
            if(a[i]==true){
                for(int j=i*i;j<=n;j+=i)
                {
                    a[j]=false;
                }
            }
        }
        return a[n];
    }
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int i;
        isprime(n);
        for(i=2;i<=n/2;i++){
            if((n-i)<0)
            {
                continue;
            } 
            if(a[i] && a[n-i]){
                List<Integer> t=new ArrayList<>();
                t.add(i);
                t.add(n-i);
                Collections.sort(t);
                ans.add(t);
            }
        }
        return ans;
    }
}