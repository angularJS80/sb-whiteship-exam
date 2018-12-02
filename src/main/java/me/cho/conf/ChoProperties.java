package me.cho.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@ConfigurationProperties("ymlcho")
public class ChoProperties {
    private String name;
    private List<YmlPojo> ymlPojolist;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<YmlPojo> getYmlPojolist() {
        return ymlPojolist;
    }

    public void setYmlPojolist(List<YmlPojo> ymlPojolist) {
        this.ymlPojolist = ymlPojolist;
    }
}
