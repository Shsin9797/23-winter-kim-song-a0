package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController{
    @Autowired // TestService ts = new TestService();
    TestService ts;

    @RequestMapping("/a")
    public String test(){

        return ts.write();
    }

}