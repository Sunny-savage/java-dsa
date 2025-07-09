public class CircularQueue {
    protected int[] data;
    private static final int Default_size = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    CircularQueue() {
        this(Default_size);
    }

    CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean ifFull() {
        return size == data.length;
    }

    public boolean ifEmpty() {
        return size == 0;
    }

    public boolean insert(int item) throws Exception {
        if (ifFull()) {
            throw new Exception("The queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (ifEmpty()) {
            throw new Exception("the queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (ifEmpty()) {
            throw new Exception("the queue is empty");
        }
        return data[front];
    }

    public void display() throws Exception {
        if (ifEmpty()) {
            throw new Exception("the queue is empty");

        }

        int i = front;
        do {
            System.out.print(data[i++] + "<--");
            i = i % data.length; // to got from index 5 to 0 ; that is to wrap around
        } while (i != end);

        System.out.println("End");
    }

}