package singletonpattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SessionManagerTest {
    @Test
    public void testSingletonMethod() {
        SessionManager sessionManager = SessionManager.getInstance();
        assertEquals(sessionManager.text, "Singleton Pattern");
    }

}