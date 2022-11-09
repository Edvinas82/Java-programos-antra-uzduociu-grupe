public class Uzd2 {
    public static void main(String[] args) {
        long x = 5;
        long y = 8;
        long z = sandauga(x, y);
        System.out.println(z);
        long a = 17;
        long b = 25;
        double c = dalyba(a, b);
        System.out.println(c);
    }
    public static long sandauga (long x, long y) {
        long atsakymas = x * y;
        return atsakymas;
    }
    public static double dalyba (double x, double y) {
        double atsakymas = x / y;
        return atsakymas;
    }
}
