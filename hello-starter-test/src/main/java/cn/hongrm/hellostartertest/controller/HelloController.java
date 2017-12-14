package cn.hongrm.hellostartertest.controller;

import cn.hongrm.hellospringbootstarter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * created by hongrm on 2017/12/14 17:59
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("hello")
    public String hello(){
        helloService.sayHello();
        return "hello";
    }
}
