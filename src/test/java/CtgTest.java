import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest {
    private Calculator calculator;

    @Test
    @Parameters({"a"})
    public void testCtg(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.ctg(a), 10);
    }
}
