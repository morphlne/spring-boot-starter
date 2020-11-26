package io.pan.clock.library;

import java.time.LocalDateTime;

public class Clock {

    private final ClockConfiguration configuration;

    public Clock(ClockConfiguration configuration) {
        this.configuration = configuration;
    }

    public String now() {
        return String.format("Hi, %s! It's %s now", configuration.name(), LocalDateTime.now());
    }
}
