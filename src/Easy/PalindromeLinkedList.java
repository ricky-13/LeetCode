package Easy;

import java.util.List;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        String s = "";
//        s = s + "aaa";

        ListNode current = head;
        while( current != null ){
            String dummy = String.valueOf(current.val);
            s = s + dummy;
            current = current.next;
        }

//        s = s + String.valueOf(current.val);

        System.out.println(s);

        if(s.length() == 1){
            return true;
        }
        char l = s.charAt(0);
        char r = s.charAt(s.length() - 1);
        for(int i = 0; i < s.length()/2; i++){
            if(l != r) {
                return false;
            } else {
                l = s.charAt(i+1);
                r = s.charAt(s.length() - 1 - i - 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] inputArray = {0, 1};

        ListNode head = new ListNode(inputArray[0]);
        ListNode current = head;

        for(int i = 1; i < inputArray.length; i++){
            current.next = new ListNode(inputArray[i]);
            current = current.next;
        }
        PalindromeLinkedList s = new PalindromeLinkedList();
        System.out.println(s.isPalindrome(head));
    }
}


