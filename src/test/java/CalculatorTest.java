import org.junit.*;

public class CalculatorTest {
    @Test
    public void addTest() {
        Assert.assertEquals(5, Calculator.add(2, 3));
        Assert.assertEquals(0, Calculator.add(3, -3));
        Assert.assertEquals(0, Calculator.add(0, 0));
        Assert.assertEquals(-9, Calculator.add(-4, -5));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(0, Calculator.subtract(4, 4));
        Assert.assertEquals(3, Calculator.subtract(9, 6));
        Assert.assertEquals(-3, Calculator.subtract(6, 9));
        Assert.assertEquals(10, Calculator.subtract(10, 0));
        Assert.assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(0, Calculator.multiply(0, 0));
        Assert.assertEquals(0, Calculator.multiply(123456789, 0));
        Assert.assertEquals(0, Calculator.multiply(0, 123456789));
        Assert.assertEquals(35, Calculator.multiply(7, 5));
        Assert.assertEquals(35, Calculator.multiply(5, 7));
        Assert.assertEquals(-50, Calculator.multiply(10, -5));
        Assert.assertEquals(64, Calculator.multiply(-8, -8));
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(0, Calculator.divide(0, 123456789));
        Assert.assertEquals(4, Calculator.divide(64, 16));
        Assert.assertEquals(12, Calculator.divide(12, 1));
        Assert.assertEquals(-5, Calculator.divide(25, -5));
        Assert.assertEquals(11, Calculator.divide(11, 0));
    }

    @Test
    public void powerTest() {
        Assert.assertEquals(1, Calculator.power(123456789, 0));
        Assert.assertEquals(64, Calculator.power(4, 3));
        Assert.assertEquals(7, Calculator.power(7, 1));
        Assert.assertEquals(256, Calculator.power(2, 8));
        Assert.assertEquals(-243, Calculator.power(-3, 5));
    }

    @Test
    public void remainderTest() {
        Assert.assertEquals(6, Calculator.remainder(60, 9));
        Assert.assertEquals(0, Calculator.remainder(60, 12));
        Assert.assertEquals(1, Calculator.remainder(123456789, 2));
        Assert.assertEquals(-110, Calculator.remainder(-360, 125));
    }
}
