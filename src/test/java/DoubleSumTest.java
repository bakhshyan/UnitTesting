import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoubleSumTest {
    private Calculator calculator;

    @Test
    @Parameters({"a","b"})
    public void testSum(double a, double b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sum(a,b),5,"");
    }

}
