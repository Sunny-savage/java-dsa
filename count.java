public class count {
    // itireatice method
    // static int countint(int n) {
    // int count = 0;

    // if (n == 0)
    // return 1;

    // while (n != 0) {
    // n = n / 10;
    // ++count;
    // }
    // return count;

    // }

    // recursive method

    static int countint(int n) {
        if (n / 10 == 0) {
            return 1;
        }

        return 1 + countint(n / 10);
    }

    public static void main(String[] args) {
        int n = 3453434;
        int ans = countint(n);
        System.out.println(ans);

    }
}
