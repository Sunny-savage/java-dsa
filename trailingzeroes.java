public class trailingzeroes {
    static int trail(int n) {
        int res = 0;
        for (int i = 5; n / i >= 1; i = i * 5) {
            res = res + n / i;
        }

        return res;
    }

    public static void main(String[] args) {
        int c = 5;
        System.out.println(trail(c));
    }
}
