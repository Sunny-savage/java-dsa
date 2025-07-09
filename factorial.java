public class factorial {
    static int fac(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fac(n));
    }
}
