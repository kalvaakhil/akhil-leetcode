class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if (dist.length == 1)  
            return (int)Math.ceil(dist[0] / hour - 0.00000005);
        if (Math.ceil(hour) < dist.length)  
            return -1;
        
        int maxDist = 1;
        for (int d : dist)  if (d > maxDist)  maxDist = d;
        
        int left = 1;
        int right = 10_000_000;
        if (onTime(dist, hour, 100, 100-1, maxDist)) {
            right = (onTime(dist, hour, 10, 10, maxDist)) ? 10 : 100;
        } else if (onTime(dist, hour, 10_000, 10_000-1, maxDist)) {
            right = (onTime(dist, hour, 1000, 1000-1, maxDist)) ? 1000 : 10_000;
        } else if (onTime(dist, hour, 1_000_000, 1_000_000-1, maxDist)) {
            right = (onTime(dist, hour, 100_000, 100_000-1, maxDist)) ? 100_000 : 1_000_000;
        } 
            
        while (left <= right) {
            int mid = (left + right) / 2;
            if (onTime(dist, hour, mid, mid - 1, maxDist))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
    
    
    private boolean onTime(int[] dist, double hour, int speed, int speedM1, int maxDist) {
        int curTime = 0;
        if (speed >= maxDist)
            curTime = dist.length - 1;
        else {
            int limit = dist.length - 1;
            for (int i = 0; i < limit; i++) 
                curTime += (dist[i] + speedM1) / speed;
        }
        return (double)curTime + (double)dist[dist.length - 1] / speed <= hour;
    }
}