import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.sql.Time;

public class TimeoutTest {

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method) {
        System.out.println("-----Start test: " + method.getName() + " ------");
    }

    @Test
    @Parameters({"sec"})
    public void sleepTest(int sec) {
        ;
        Timeout.sleep(sec);
    }

    @AfterMethod
    public void finishTest(Method method) {
        System.out.println("-----Finished test: " + method.getName() + "------");
    }
}
