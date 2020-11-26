package io.pan.clock.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClockTest {

    @Test
    public void givenName_whenNow_thenSuccess() {
        final String expectedName = "Test";
        final Clock clock = new Clock(new ClockConfiguration(expectedName));
        assertTrue(clock.now().contains(expectedName));
    }
}
