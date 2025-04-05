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
    
}
