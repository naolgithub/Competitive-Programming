class RecentCounter {
    private Queue<Integer> countNumberOfRecentRequests;
    public RecentCounter() {
        countNumberOfRecentRequests=new LinkedList();
    }
    
    public int ping(int t) {
        countNumberOfRecentRequests.add(t);
        while(t>countNumberOfRecentRequests.peek()+3000){
            countNumberOfRecentRequests.poll();
        }
        return countNumberOfRecentRequests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */