import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SinTest {
    private Calculator calculator;

    @Test
    @Parameters({"a"})
    public void testSin(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sin(a), 10);
    }
}
