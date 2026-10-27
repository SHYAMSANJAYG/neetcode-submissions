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
        Node temp = head;
        while(temp!=null){
            Node newNode= new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.random == null){
                temp.next.random = null;
            }
            else{
            temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node dummy = new Node(0);
        temp = head;
        Node res = dummy;
        while(temp!=null){
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}