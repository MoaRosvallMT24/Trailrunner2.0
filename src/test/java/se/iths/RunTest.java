package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.iths.Run;

public class RunTest {
   
    @Test
    public void testNewRun() {
        Run cut = new Run("Test Run", 0.0, 0, "June15");
        assertEquals("Test Run", cut.getId());
    } 
    
    @Test
    public void testCalculateAverageSpeed() {
        Run cut = new Run("Test Run", 10.0, 60, "June15");
        double expectedSpeed = 10.0 / (60.0 / 60.0); // distance in km, time in hours
        assertEquals(expectedSpeed, cut.calculateAverageSpeed(), 0.01);
    }

    @Test
    public void testCalculateTimePerKm(){
        Run cut = new Run("Test Run", 10.0, 60, "June15");
        double expectedTimePerKm = 60.0/10.0; // time in minutes per km
        assertEquals(expectedTimePerKm, cut.calculateTimePerKm(), 0.01);
    }
}
