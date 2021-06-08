import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest {
    private Calculator calculator;

    @Test
    @Parameters({"a"})
    public void testCos(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.cos(a), 10);
    }
}
