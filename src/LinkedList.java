/**
 * Created by brainbreaker on 23/10/16.
 */
public class LinkedList {
    private class Node {
        int data;
        Node next;
    }
    boolean hasCycle(Node head) {
        if(head== null) // list does not exist..so no loop either.
            return false;

        Node slow, fast; // create two references.

        slow = fast = head; // make both refer to the start of the list.

        while(true) {

            slow = slow.next;          // 1 hop.

            if(fast.next != null)
                fast = fast.next.next; // 2 hops.
            else
                return false;          // next node null => no loop.

            if(slow == null || fast == null) // if either hits null..no loop.
                return false;

            if(slow == fast) // if the two ever meet...we must have a loop.
                return true;
        }
    }

    public static void main(String[] args){

    }
}
