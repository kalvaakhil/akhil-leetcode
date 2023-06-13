class Solution {
    public int trap(int[] h) {
        int l=0,r=h.length-1,lmax=0,rmax=0,water=0;
        while(l<=r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);
            water+=(lmax<rmax)? lmax-h[l++]:rmax-h[r--];
        }
        return water--;
    }
}