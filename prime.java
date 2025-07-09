public class prime {
    static boolean prii(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // the increment 6 is because, any number which can be prime after 2,3 is 6k
    // +-1, example 5, 7, 11, 13 etc, so we are just making sure to check with these
    // numbers coz we have alredy checked for the multiples of 2 and 3.
    // and that is the same reason we are divinding it by i and i + 2 it will give
    // us the middle prime numbers like i = 5, i + 2 = 7, and so on and on .
    //this reduces the number of itirations.

    public static void main(String[] args) {
        System.out.println(prii(121));
    }
}
