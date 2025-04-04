package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.iths.*;

public class RunTest {
   
    @Test
    public void testNewRun() {
        Run cut = new Run("Test Run", 0.0, 0, "June15");
        assertEquals("Test Run", cut.getId());
    }   
}
