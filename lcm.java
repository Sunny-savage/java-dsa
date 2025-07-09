public class lcm {
    static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }

        return hcf(b, a % b);
    }

    static int lc(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lc(12, 24));
    }
}
