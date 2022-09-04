class MyLinkedList {
    // Singly Linked List Node
    class SinglyListNode {
        int val;
        SinglyListNode next;
        SinglyListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // keep track of head, tail and length of Singly Linked List
    private SinglyListNode head;
    private SinglyListNode tail;
    private int length;
    // initialize head,tail and length
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // helper function to get the node at a given index
    private SinglyListNode getNode(int index) {
        // check if index is valid
        if(index < 0 || index >= this.length)
            return null;
        SinglyListNode node = this.head;
        for(int i = 0; i < index && node != null; i++)
            node = node.next;
        return node;
    }
    
    public int get(int index) {
        SinglyListNode node = getNode(index);
        return (node == null) ? -1 : node.val;
    }
    
    public void addAtHead(int val) {
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = this.head;
        // update tail if Linked List is empty
        if(this.head == null){
            this.tail = newNode;
            }
        // update head and now head points to newNode
        this.head = newNode;
        // increase length by one
        this.length += 1;
    }
    
    public void addAtTail(int val) {
        if(this.head == null) {
            addAtHead(val);
            return;
        }
        SinglyListNode newNode = new SinglyListNode(val);
        // connect tail to newNode
        this.tail.next = newNode;
        // update tail
        this.tail = newNode;
        // increase length by one
        this.length += 1;
    }
    
    public void addAtIndex(int index, int val) {
        // check if index is valid
        if(index < 0 || index > this.length)
            return;
        // add at beginning of Linked List
        if(index == 0) {
            addAtHead(val);
            return;
        }
        // add at end of Linked List
        if(index == this.length) {
            addAtTail(val);
            return;
        }
        SinglyListNode node = getNode(index - 1);
        if(node == null)
            return;
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = node.next;
        node.next = newNode;
        this.length += 1;
    }
    
    public void deleteAtIndex(int index) {
        // check if index is valid
        if(index < 0 || index >= this.length)
            return;
        // delete at beginning of Linked List
        if(index == 0) {
            this.head = this.head.next;
            this.length -= 1;
            return;
        }
        SinglyListNode node = getNode(index - 1);
        if(node == null || node.next == null)
            return;
        node.next = node.next.next;
        // update tail if deleting at end of Linked List
        if(node.next == null)
            this.tail = node;
        this.length -= 1;
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