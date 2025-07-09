public class CycleQuestions {

    // find hascycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;

    }

    // count the number of elements in cycle
    public int hasLenght(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);
            }
        }

        return count;

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}