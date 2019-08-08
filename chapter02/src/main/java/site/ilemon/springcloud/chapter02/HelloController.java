package site.ilemon.springcloud.chapter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andy on 2019/8/8.
 */
@RestController
public class HelloController {

    @Autowired
    private MyConfig config;

    @GetMapping("/hello")
    public String hello(){
        return config.getName();
    }
}
