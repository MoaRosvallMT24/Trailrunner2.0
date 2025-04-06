package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import se.iths.Run;
import se.iths.RunLog;

public class RunLogTest {

    @Test
    public void testAddRun() {
        RunLog cut = new RunLog();
        Run myRun = new Run("Test Run", 3.0, 20, "June15");
        cut.addRun(myRun);
        List<Run> myRunLog = cut.getLog();
        assertEquals(myRun, myRunLog.get(0));
    }
    
}
