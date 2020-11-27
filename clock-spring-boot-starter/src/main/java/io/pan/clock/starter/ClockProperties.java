package io.pan.clock.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("clock")
public class ClockProperties {

    private final String name;

    public ClockProperties(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
