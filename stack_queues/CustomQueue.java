public class CustomQueue {
    protected int[] data;
    private static final int Default_size = 10;
    int end = 0;

    CustomQueue() {
        this(Default_size);
    }

    CustomQueue(int size) {
        this.data = new int[size];
    }

  

    public boolean ifFull() {
        return end == data.length;
    }

    public boolean ifEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (ifFull()) {
            return false;
        }

        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (ifEmpty()) {
            throw new Exception("the queue is already empty");

        }
        int removed = data[0];

        // shift the elements.......

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;

    }

    public int front() throws Exception {
        if (ifEmpty()) {
            throw new Exception("the queue is empty");
        }

        return data[0];

    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
