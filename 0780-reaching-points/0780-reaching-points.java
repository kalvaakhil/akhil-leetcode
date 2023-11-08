public class Solution{
	public boolean reachingPoints(int sx, int sy, int tx, int ty){
		while(sx < tx && sy < ty){
			if(tx > ty){
				tx = tx % ty;
			}
			else{
				ty = ty % tx;
			}
		}
		if(sx == tx && sy <= ty){
			return (ty - sy) % tx == 0;
		}
		else{
			return sy == ty && sx <= tx && (tx - sx) % ty == 0;
		}
	}
}