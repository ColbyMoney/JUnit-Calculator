public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double)a / (double)b;
    }

    public int power(int a, int b) {
        return a ^ b;
    }

    public int square(int a) {
        return a * a;
    }

    public double squareRoot(int a) {
        return Math.sqrt((double)a);
    }
}
