public class gcd {

    //advanced euclidian formula
    static int gc(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gc(b, a % b);
    }


    public static void main(String[] args) {
        System.out.println(gc(10, 15));
    }
}
