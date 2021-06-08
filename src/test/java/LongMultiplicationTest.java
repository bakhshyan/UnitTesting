import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LongMultiplicationTest {
    private Calculator calculator;

    @Test
    @Parameters({"a","b"})
    public void testMultiplication(long a, long b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.mult(a,b),10,"");
    }

}
