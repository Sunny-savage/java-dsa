public class CustomStack {
    protected int[] data;
    private static final int Default_size = 10;
    int ptr = -1;

    CustomStack() {
        this(Default_size);
    }

    CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (ifFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws StackException {
        if (ifEmpty()) {
            throw new StackException("stack is empty");

        }

        // int removed = data[ptr];
        // ptr--;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (ifEmpty()) {
            throw new StackException("stack is empty");
        }

        return data[ptr];
    }

    public boolean ifFull() {
        return ptr == data.length - 1;
    }

    public boolean ifEmpty() {
        return ptr == -1;
    }

}
