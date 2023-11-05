class Solution {
    public int buyChoco(int[] prices, int money) {
        int rem = money;
        Arrays.sort(prices);
        int count=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] <= rem){
                count++;
                rem -= prices[i];
            }
            if(count==2){
                break;
            }
        }
        if(count!=2){
            return money;
        }
        return rem;
    }
}