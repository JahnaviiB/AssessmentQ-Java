public class PowerFunction {
    public static double PowerFunction(double a1, int b1) {
        double r = 1.0;
        for (int i = 1; i <= Math.abs(b1); i++) {
            r *= a1;
        }
        if (b1 < 0) {
            r = 1.0 / r;
        }
        return r;
    }

    public static void main(String[] args) {
        double a = 2;
        int b = 4;
        double result = PowerFunction(a, b);
        System.out.println("The value of a to the power b is: " + result);
    }
}