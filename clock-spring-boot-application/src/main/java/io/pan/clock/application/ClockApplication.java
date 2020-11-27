package io.pan.clock.application;

import io.pan.clock.library.Clock;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClockApplication implements CommandLineRunner {

    private final Clock clock;

    public ClockApplication(Clock clock) {
        this.clock = clock;
    }

    public static void main(String[] args) {
        new SpringApplication(ClockApplication.class).run(args);
    }

    public void run(String[] args) {
        System.out.println(clock.now());
    }
}
