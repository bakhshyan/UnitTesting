import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoubleMultiplicationTest {
    private Calculator calculator;

    @Test
    @Parameters({"a","b"})
    public void testMultiplication(double a, double b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.mult(a,b),6,"");
    }

}
