package me.cho.conf;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevBean implements IFProfile{

    @Override
    public String getActive() {
        return "dev";
    }
}
