
class SeatManager {
    private PriorityQueue<Integer> seatRegis  = null;
    public SeatManager(int n) {
        seatRegis = new PriorityQueue<>();
        for(int seat = 1; seat <= n; seat++){
            seatRegis.offer(seat);
        }
    }
    
    public int reserve() {
        return seatRegis.poll();
    }
    
    public void unreserve(int seatNumber) {
        seatRegis.offer(seatNumber);
    }
}