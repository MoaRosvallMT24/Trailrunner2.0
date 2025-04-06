package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import se.iths.Run;

public class RunTest {
   
    @Test
    public void testNewRun() {

        //Arrange & Act
        Run cut = new Run("Run1", 0.0, 0, LocalDate.parse("2025-04-01"));

        //Assert
        assertEquals("Run1", cut.getId());
    } 
    
    @Test
    public void testCalculateAverageSpeed() {

        // Arrange
        Run cut = new Run("Run1", 10.0, 60, LocalDate.parse("2025-04-01"));
        double expectedAverageSpeed = cut.getDistance() / (cut.getMinutes()/60); // speed in km/h

        // Act
        double actualAverageSpeed = cut.calculateAverageSpeed();

        // Assert
        assertEquals(expectedAverageSpeed, actualAverageSpeed, 0.01);
    }

    @Test
    public void testCalculateTimePerKm(){

        //Arrange
        Run cut = new Run("Run1", 10.0, 60, LocalDate.parse("2025-04-01"));
        double expectedTimePerKm = cut.getMinutes()/cut.getDistance(); // time in minutes per km

        //Act
        double actualTimePerKm = cut.calculateTimePerKm();

        //Assert
        assertEquals(expectedTimePerKm, actualTimePerKm, 0.01);
    }

    @Test
    public void testNewRunWithUserInput() {

        //Arrange
        String simulatedInput = "Run1\n5.0\n30\n2025-04-01\n";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        //Act
        try {
            Run cut = new Run();

            //Assert
            assertEquals("Run1", cut.getId());
            assertEquals(5.0, cut.getDistance(), 0.01);
            assertEquals(30, cut.getMinutes());
            assertEquals("2025-04-01", cut.getDate());
        } finally {
            
            // Reset
            System.setIn(System.in);
        }
    }
}
