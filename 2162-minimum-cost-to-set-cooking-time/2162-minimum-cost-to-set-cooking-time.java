class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int minutes = targetSeconds/60;//Convert targetseconds to minutes and seconds
        int seconds = targetSeconds%60;
        //We have 2 option
        return Math.min(findMinCost(startAt,moveCost,pushCost,minutes,seconds),
                        findMinCost(startAt,moveCost,pushCost,minutes-1,60+seconds));
    }
    public int findMinCost(int startAt, int moveCost, int pushCost, int minutes, int seconds){
        if(seconds< 0 || minutes<0 || minutes>99 || seconds>99){
            return Integer.MAX_VALUE;
        }
        int minCost = 0;
        int microwaveTime = (minutes*100)+seconds;//So avoid leading zeros 6:10 --->610
        char digits[] = String.valueOf(microwaveTime).toCharArray();
        for(char digitChar : digits){
            int digit = digitChar -'0';
            minCost = minCost+ pushCost + (startAt==digit?0:moveCost);//if the current digit is different then previous one we need to add a move cost since we move to a different position
            startAt = digit;
        }
        return minCost;
    }
}