package cn.hongrm.hellospringbootstarter;

/**
 * created by hongrm on 2017/12/14 17:01
 */
public class HelloService {
    private String name;
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

    public final void sayHello(){
        System.out.println(name+" hello !");
    }
}
