class ListNode {
    String val;
    ListNode next;
    ListNode prev;
    ListNode() {};
    ListNode(String val){
        this.val = val; 
    }
    ListNode(String val, ListNode next, ListNode prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class BrowserHistory {
    ListNode browser;
    ListNode current;
    public BrowserHistory(String homepage) {
        browser = new ListNode(homepage);
        current = browser;
    }

    public void visit(String url) {
        
        current.next = new ListNode(url);
        
        ListNode temp = current;
        
        current = current.next;
        
        current.prev = temp;
    }

    public String back(int steps) {
        int index = 0;
        while (index != steps && current.prev != null){
            current = current.prev;
            index++;
        }
        return current.val;
    }

    public String forward(int steps) {
        int index = 0;
        while (index != steps && current.next != null){
            current = current.next;
            index++;
        }
        return current.val;
    }
}