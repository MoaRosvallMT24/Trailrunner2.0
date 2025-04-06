package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import se.iths.User;

public class UserTest {

    @Test
    public void testNewUser() {

        // Arrange & Act
        User cut = new User("TestUser", 0.0, 0.0);
        
        // Assert
        assertEquals("TestUser", cut.getUsername());
        assertEquals(0.0, cut.getWeight(), 0.01);
        assertEquals(0.0, cut.getHeight());
        
    }

    @Test
    public void testNewUserWithUserInput() {

        // Arrange
        String simulatedInput = "TestUser\n70.0\n1.75\n";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Act
        try {
            User cut = new User();

            // Assert
            assertEquals("TestUser", cut.getUsername());
            assertEquals(70.0, cut.getWeight(), 0.01);
            assertEquals(1.75, cut.getHeight(), 0.01);
        } finally {
            
            // Reset
            System.setIn(System.in);
        }

    }

    @Test
    public void testCalculateBMI() {
        
        // Arrange
        User cut = new User("TestUser", 70.0, 1.75);
        double expectedBMI = cut.getWeight() / (cut.getHeight() * cut.getHeight());

        // Act
        double actualBMI = cut.calculateBMI();

        // Assert
        assertEquals(expectedBMI, actualBMI, 0.01);
    }
    
}
