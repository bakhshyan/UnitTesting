import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoubleDivisionTest {
    private Calculator calculator;

    @Test
    @Parameters({"a","b"})
    public void testDivision(double a, double b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.div(a,b),0.6666666666666666,"");
    }

}
