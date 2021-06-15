import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class CtgTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method) {
        System.out.println("-----Start test: " + method.getName() + " ------");
    }

    @Test
    @Parameters({"a"})
    public void testCtg(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.ctg(a), 10);
    }

    @AfterMethod
    public void finishTest(Method method) {
        System.out.println("-----Finished test: " + method.getName() + "------");
    }
}
