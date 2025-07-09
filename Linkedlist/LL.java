public class LL {
    private Node head;
    private int size;
    private Node tail;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value); // this is written so that if the linkedist is empty then insert will happen
                                // from the first
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node insert = new Node(val, temp.next);

        temp.next = insert;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    // insert using recursion
    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, --index, node.next);
        return node;
    }

    public void deleteLast() {
        // better way would be not to use the tail , instead we should be using the get
        // method to get the secoind last value

        if (size <= 1) {
            deleteFirst();
            return;
        }

        Node lastSecond = get(size - 2);

        tail = lastSecond;
        tail.next = null;

        // while (temp.next != tail) {
        // temp = temp.next;
        // }
        // tail = temp;
        // temp.next = null;

        size--;
    }

    // fucntion to get the node reference
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void deleteIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        // same here, the better way is to get the node using the get function
        Node temp = get(index - 1);

        temp.next = temp.next.next;
        size--;
    }

    public Node getNodee(int value) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }

        return null;

    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "  --->  ");
            temp = temp.next;
        }

        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Questios :
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;

    }

    public static LL merge(LL first, LL second) {
        LL nayi = new LL();
        while (first.head != null && second.head != null) {
            if (first.head.value < second.head.value) {
                nayi.insertLast(first.head.value);
                first.head = first.head.next;
            } else {
                nayi.insertLast(second.head.value);
                second.head = second.head.next;
            }
        }

        while (first.head != null) {
            nayi.insertLast(first.head.value);
            first.head = first.head.next;
        }
        while (second.head != null) {
            nayi.insertLast(second.head.value);
            second.head = second.head.next;
        }

        return nayi;
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);

        second.insertLast(2);
        second.insertLast(3);

        second.insertLast(5);

        second.insertLast(9);

        second.insertLast(10);

        LL ans = LL.merge(first,second);
        ans.display();

    }
}
