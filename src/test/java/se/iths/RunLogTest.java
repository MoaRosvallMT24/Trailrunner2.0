package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import se.iths.Run;
import se.iths.RunLog;

public class RunLogTest {

    @Test
    public void testAddRun() {

        // Arrange
        RunLog cut = new RunLog();
        Run myRun = new Run("Test Run", 3.0, 20, "June15");
        List<Run> myRunLog = cut.getLog();

        // Act
        cut.addRun(myRun);

        // Assert
        assertEquals(myRun, myRunLog.get(0));
    }

    @Test
    public void testCalculateTotalDistance() {

        // Arrange
        RunLog cut = new RunLog();
        Run myRun1 = new Run("Run1", 5.0, 30, "June15");
        Run myRun2 = new Run("Run2", 10.0, 60, "June16");
        cut.addRun(myRun1);
        cut.addRun(myRun2);

        // Act
        Double totalDistance=cut.calculateTotalDistanse();

        // Assert
        assertEquals(15.0, totalDistance, 0.01);
    }
    
}
