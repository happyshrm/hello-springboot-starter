package cn.hongrm.hellospringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * created by hongrm on 2017/12/14 16:57
 */
@ConfigurationProperties(prefix = "my")
public class MyProperties {
    private String name ;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
