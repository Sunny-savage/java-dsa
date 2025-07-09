public class StackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(343);
        stack.push(33);

        // stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       



    }
}
