public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0. Returning dividend value.");
            return a;
        }
    }

    public static int power(int a, int b) {
        return (int)Math.pow(a, b);
    }

    public static int remainder(int a, int b) {
        return a % b;
    }
}
