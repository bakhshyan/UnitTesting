import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest {
    private Calculator calculator;

    @Test
    @Parameters({"a"})
    public void testSqrt(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sqrt(a), 10);
    }
}
