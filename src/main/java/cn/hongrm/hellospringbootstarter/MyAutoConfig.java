package cn.hongrm.hellospringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by hongrm on 2017/12/14 16:57
 */
@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfig {
    @Autowired
    private MyProperties logProperties;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setAge(logProperties.getAge());
        helloService.setName(logProperties.getName());
        System.out.println("hello service init ");
        return helloService;
    }

}
