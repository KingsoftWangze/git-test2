package helloworld.controller;

import helloworld.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Test2Controller {
    @Autowired
    private Test2Service service;

    @RequestMapping("/hello")
    @ResponseBody
    public String method(){
        return service.hello();
    }
}
