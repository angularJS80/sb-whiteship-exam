package me.cho.conf;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean implements IFProfile{

    @Override
    public String getActive() {
        return "prod";
    }
}
