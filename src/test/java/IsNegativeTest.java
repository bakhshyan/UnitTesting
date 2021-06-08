import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsNegativeTest {
    private Calculator calculator;

    @Test
    @Parameters({"val"})
    public void testIsPositive(long val) {
        calculator = new Calculator();
        Assert.assertTrue(calculator.isNegative(val));

    }
}
