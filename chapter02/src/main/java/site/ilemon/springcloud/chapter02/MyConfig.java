package site.ilemon.springcloud.chapter02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by andy on 2019/8/8.
 */
@ConfigurationProperties(prefix = "site.ilemon.config")
@Component
public class MyConfig {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
