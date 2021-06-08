import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TgTest {
    private Calculator calculator;

    @Test
    @Parameters({"a"})
    public void testTg(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.tg(a), 10);
    }
}
