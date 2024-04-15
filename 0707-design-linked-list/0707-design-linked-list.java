class ListNode{
    public int val;
    public ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int sizeOfLinkedList;
    public MyLinkedList() {
        head=null;
        tail=null;
        sizeOfLinkedList=0;
    }
    
    public int get(int index) {
        if(index>=sizeOfLinkedList || index<0) return -1;
        ListNode currentNode = head;
        for(int i=0;i<index;i++){
            currentNode=currentNode.next;
        }
        return currentNode.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode=new ListNode(val);
        if(sizeOfLinkedList==0){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        sizeOfLinkedList++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode=new ListNode(val);
        if(sizeOfLinkedList==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        sizeOfLinkedList++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>sizeOfLinkedList){
            return ;
        }
        if(index==0){
            addAtHead(val);
        }
        else {
            ListNode newNode = new ListNode(val);
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
            sizeOfLinkedList++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= sizeOfLinkedList) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (index == sizeOfLinkedList - 1) {
                tail = current;
            }
        }
        sizeOfLinkedList--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */