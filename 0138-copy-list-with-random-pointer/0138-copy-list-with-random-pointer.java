/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //base case
        if(head==null) return null;
        //define table
        HashMap<Node,Node> map=new HashMap();
        //define current pointer = head
        Node current=head;
        map.put(current,new Node(current.val));
        //while current pointer ! = null
        while(current!=null){
            //1.get the new node of the current pointer
            Node currentClone=map.get(current);
            //2.Build the random pointer if doesn't exist in the table
            if(current.random!=null && !map.containsKey(current.random)){
                map.put(current.random,new Node(current.random.val));
            }
            Node randomClone=map.get(current.random);
            //3.get new current node point to new random node
            currentClone.random=randomClone;
            //4.Build the next node if doesn't exists in the table 
            if(current.next!=null&& !map.containsKey(current.next)){
                map.put(current.next,new Node(current.next.val));
            }
            Node nextClone=map.get(current.next);
            //5.Get the new current node point to the next new node
            currentClone.next=nextClone;
            //6.current pointer move the next node
            current=current.next;
        }
        //return the new head node from the table
        return map.get(head);
    }
}