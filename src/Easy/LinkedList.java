package Easy;

public class LinkedList {

    public class ListNode {
         int val;
         ListNode next;
         ListNode() {
             val = 0;
             next = null;
         }
         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }

    }

    private ListNode head;

    public LinkedList(){
        head = null;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

    }

}
