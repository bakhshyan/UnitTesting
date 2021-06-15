import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class LongSumTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method) {
        System.out.println("-----Start test: " + method.getName() + " ------");
    }

    @Test
    @Parameters({"a", "b"})
    public void testSum(long a, long b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sum(a, b), 10, "");
    }

    @AfterMethod(alwaysRun = true)
    public void finishTest(Method method) {
        System.out.println("-----Finished test: " + method.getName() + "------");
    }
}
