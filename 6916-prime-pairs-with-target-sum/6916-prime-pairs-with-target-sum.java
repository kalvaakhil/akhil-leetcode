class Solution {
    boolean a[]=new boolean[1000001];
    public boolean isprime(int n){
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
        int x=(int)Math.pow(10,6);
        isprime(x);
        for(i=2;i<=n/2;i++){
            if((n-i)<0)
            {
                continue;
            } 
            if(a[i]==true && a[n-i]==true){
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