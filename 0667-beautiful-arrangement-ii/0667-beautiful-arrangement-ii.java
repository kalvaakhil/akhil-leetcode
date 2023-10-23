class Solution {
    public int[] constructArray(int n, int k) {

        int num=-1;
        int[] res = new int[n];
        res[0]=n;
        for(int i=1;i<n;i++){
            if(i<k){
                if(num>0){    
                    res[i]=res[i-1]+(n-i);
                    num*=-1;
                }else{
                    res[i]=res[i-1]-(n-i);
                    num*=-1;
                }
            }else{
                res[i]=res[i-1]+num;
            }
        }

        return res;

    }
}