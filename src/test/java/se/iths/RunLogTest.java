package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;
import se.iths.Run;
import se.iths.RunLog;

public class RunLogTest {

    @Test
    public void testAddRun() {

        // Arrange
        RunLog cut = new RunLog();
        Run myRun = new Run("Run1", 5.0, 30, LocalDate.parse("2025-04-01"));
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
        Run myRun1 = new Run("Run1", 5.0, 30, LocalDate.parse("2025-04-01"));
        Run myRun2 = new Run("Run2", 10.0, 60, LocalDate.parse("2025-04-02"));
        cut.addRun(myRun1);
        cut.addRun(myRun2);

        // Act
        Double totalDistance=cut.calculateTotalDistance();

        // Assert
        assertEquals(15.0, totalDistance, 0.01);
    }

    @Test
    public void testCalculateAverageDistance() {

        // Arrange
        RunLog cut = new RunLog();
        Run myRun1 = new Run("Run1", 5.0, 30, LocalDate.parse("2025-04-01"));
        Run myRun2 = new Run("Run2", 10.0, 60, LocalDate.parse("2025-04-02"));
        cut.addRun(myRun1);
        cut.addRun(myRun2);

        // Act
        Double averageDistance=cut.calculateAverageDistance();

        // Assert
        assertEquals(7.5, averageDistance, 0.01);
    }

    @Test
    public void testPrintRunById() {

        // Arrange
        RunLog cut = new RunLog();
        Run myRun1 = new Run("Run1", 5.0, 30, LocalDate.parse("2025-04-01"));
        Run myRun2 = new Run("Run2", 10.0, 60, LocalDate.parse("2025-04-02"));
        cut.addRun(myRun1);
        cut.addRun(myRun2);
        String expectedOutput = "Run ID: Run1, Distance: 5.0 km, Time: 30 minutes, Date: 2025-04-01";
       
        // Redirect output
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));
        
        // Act        
        cut.printRunById("Run1");
        String output = outputStream.toString().trim();
       
        // Assert
        assertEquals(expectedOutput, output);

        // Reset
        System.setOut(System.out);    
    }

    @Test
    public void testDeleteRunById() {

        // Arrange
        RunLog cut = new RunLog();
        Run myRun1 = new Run("Run1", 5.0, 30, LocalDate.parse("2025-04-01"));
        Run myRun2 = new Run("Run2", 10.0, 60, LocalDate.parse("2025-04-02"));
        cut.addRun(myRun1);
        cut.addRun(myRun2);
        List<Run> myRunLog = cut.getLog();

        // Act
        cut.deleteRunById("Run1");

        // Assert        
        assertEquals(1, myRunLog.size());
        assertEquals(myRun2, myRunLog.get(0));
    }

    
}
