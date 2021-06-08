import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LongSumTest {
    private Calculator calculator;

    @Test
    @Parameters({"a","b"})
    public void testSum(long a, long b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sum(a,b),10,"");
    }

}
