package io.pan.clock.library;

public class ClockConfiguration {

    private final String name;

    public ClockConfiguration(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
