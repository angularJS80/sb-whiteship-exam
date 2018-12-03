package me.cho.conf;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestBean implements IFProfile{

    @Override
    public String getActive() {
        return "test";
    }
}
