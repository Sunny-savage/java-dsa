public class palindrome {
    static boolean palin(int n) {

        int temp = n;
        int reverse = 0;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (reverse == n);

    }

    public static void main(String[] args) {
        int n = 1331;
        System.out.println(palin(n));
    }
}
