public class DLL {
    private Node head;
    private Node tail;
    private int size = 0;

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;

        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;

        }

        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;

    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ---->");
            temp = temp.next;
        }

        System.out.println("=====> END");
    }

    public void displayReverse() {

        Node temp2 = head;
        Node temp = null;

        while (temp2 != null) {
            temp = temp2;

            temp2 = temp2.next;
        }

        while (temp != null) {
            System.out.print(temp.val + " ---->");
            temp = temp.previous;
        }

        System.out.println("=====> END");
    }

    public void insertLast(int val) {

        Node lastt = new Node(val);
        lastt.next = null;
        if (head == null) {
            lastt.previous = null;
            head = lastt;
            return;
        }
        // lastt.previous = tail;
        // tail.next = lastt;
        // lastt.next = null;
        // tail = lastt;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;

        }
        lastt.previous = temp;
        temp.next = lastt;
        tail = lastt;
        size++;
    }

    public void insertAfer(int after, int val) {
        Node temp = head;
        while (temp != null && temp.val != after) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("It does not exist");
            return;
        }
        Node newnode = new Node(val);

        newnode.next = temp.next;
        temp.next = newnode;
        newnode.previous = temp;

        if (newnode.next != null) {
            newnode.next.previous = newnode;

        }

        size++;

    }

    public class Node {
        private int val;
        private Node next;
        private Node previous;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node previous) {
            this.val = val;
            this.previous = previous;
            this.next = next;
        }
    }
}
