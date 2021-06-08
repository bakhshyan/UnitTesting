import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoubleSubtractionTest {
    private Calculator calculator;

    @Test
    @Parameters({"a","b"})
    public void testSubtraction(double a, double b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sub(a,b),-1,"");
    }

}
