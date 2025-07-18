public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // this will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // this will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if (this.ifFull()) {
            // double the array
            int[] temp = new int[data.length * 2];

            // copy the data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;

        }

        return super.push(item);

    }
}
