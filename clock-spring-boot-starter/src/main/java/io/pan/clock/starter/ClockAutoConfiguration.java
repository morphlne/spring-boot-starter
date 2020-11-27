package io.pan.clock.starter;

import io.pan.clock.library.Clock;
import io.pan.clock.library.ClockConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ClockProperties.class)
public class ClockAutoConfiguration {

    private final ClockProperties properties;

    public ClockAutoConfiguration(ClockProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public Clock clock() {
        return new Clock(new ClockConfiguration(properties.name()));
    }
}
