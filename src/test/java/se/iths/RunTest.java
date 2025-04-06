package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import se.iths.Run;

public class RunTest {
   
    @Test
    public void testNewRun() {
        Run cut = new Run("Run1", 0.0, 0, LocalDate.parse("2025-04-01"));
        assertEquals("Run1", cut.getId());
    } 
    
    @Test
    public void testCalculateAverageSpeed() {
        Run cut = new Run("Run1", 10.0, 60, LocalDate.parse("2025-04-01"));
        double expectedSpeed = 10.0 / (60.0 / 60.0); // distance in km, time in hours
        assertEquals(expectedSpeed, cut.calculateAverageSpeed(), 0.01);
    }

    @Test
    public void testCalculateTimePerKm(){
        Run cut = new Run("Run1", 10.0, 60, LocalDate.parse("2025-04-01"));
        double expectedTimePerKm = 60.0/10.0; // time in minutes per km
        assertEquals(expectedTimePerKm, cut.calculateTimePerKm(), 0.01);
    }

    @Test
    public void testNewRunWithUserInput() {
        String simulatedInput = "Run1\n5.0\n30\n2025-04-01\n";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        try {
            Run cut = new Run();
            assertEquals("Run1", cut.getId());
            assertEquals(5.0, cut.getDistance(), 0.01);
            assertEquals(30, cut.getMinutes());
            assertEquals(LocalDate.parse("2025-04-01"), cut.getDate());
        } finally {
            System.setIn(System.in);
        }
    }
}
