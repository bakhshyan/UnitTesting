import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DoubleMultiplicationTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method) {
        System.out.println("-----Start test: " + method.getName() + " ------");
    }

    @Test
    @Parameters({"a", "b"})
    public void testMultiplication(double a, double b) {
        calculator = new Calculator();
        Assert.assertEquals(calculator.mult(a, b), 6, "");
    }

    @AfterMethod(alwaysRun = true)
    public void finishTest(Method method) {
        System.out.println("-----Finished test: " + method.getName() + "------");
    }

}
