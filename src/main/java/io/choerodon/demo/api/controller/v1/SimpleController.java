package io.choerodon.demo.api.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Value("${hand.name}")
    private String name;

    @Value("${hand.id}")
    private String id;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,"+id+","+name;
    }
}
