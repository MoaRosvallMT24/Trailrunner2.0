package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import se.iths.User;

public class UserTest {

    @Test
    public void testNewUser() {
        User cut = new User("TestUser", 0.0, 0.0);
        assertEquals("TestUser", cut.getUsername());
        assertEquals(0.0, cut.getWeight(), 0.01);
        assertEquals(0.0, cut.getHeight());
        
    }

    @Test
    public void testNewUserWithUserInput() {
        String simulatedInput = "TestUser\n70.0\n1.75\n";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        try {
            User cut = new User();

            assertEquals("TestUser", cut.getUsername());
            assertEquals(70.0, cut.getWeight(), 0.01);
            assertEquals(1.75, cut.getHeight(), 0.01);
        } finally {
            
            System.setIn(System.in);
        }

    }

    @Test
    public void testCalculateBMI() {
        User cut = new User("TestUser", 70.0, 1.75);
        double expectedBMI = 22.86;
        assertEquals(expectedBMI, cut.calculateBMI(), 0.01);
    }
    
}
