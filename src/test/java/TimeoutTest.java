import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Time;

public class TimeoutTest {


    @Test
    @Parameters({"sec"})
    public void sleepTest(int sec) { ;
       Timeout.sleep(sec);
    }
}
