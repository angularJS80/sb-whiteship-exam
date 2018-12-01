package me.cho;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class AppStartListener implements ApplicationListener<ApplicationStartedEvent> {


    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("custom started message");
    }
}
