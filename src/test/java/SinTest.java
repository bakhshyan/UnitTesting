import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SinTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method) {
        System.out.println("-----Start test: " + method.getName() + " ------");
    }

    @Test
    @Parameters({"a"})
    public void testSin(double a) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.sin(a), 10);
    }

    @AfterMethod(alwaysRun = true)
    public void finishTest(Method method) {
        System.out.println("-----Finished test: " + method.getName() + "------");
    }
}
