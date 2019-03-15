## Design pattern
### 开闭原则
- 定义：一个软件实体入类、模块和函数应该对扩展开放，对修改关闭
- 用抽象构建框架，用实现扩展细节（==面向抽象编程==）
- 优点：提高软件系统的可复用性以及可维护性

```java
/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Course
 * @description Course
 * @date 2019-03-15 16:03
 **/

public interface Course {
    Integer getId();

    String getName();

    Double getPrice();
}
```

```java
/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaCourse
 * @description Java Course
 * @date 2019-03-15 16:04
 **/

public class JavaCourse implements Course {

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
```
```java
/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaDiscountCource
 * @description JavaCourse扩展类
 * @date 2019-03-15 16:13
 **/

public class JavaDiscountCource extends JavaCourse {
    public JavaDiscountCource(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
```
```java
public class Test {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        Course javaCourse = new JavaDiscountCource(92, "Java从入门到放弃", 100d);

        logger.info("编号：{},课程名称：{},原售价格：{},现售价格{}", javaCourse.getId(), javaCourse.getName(), ((JavaDiscountCource) javaCourse).getOriginPrice(), javaCourse.getPrice());
    }
}
```
类图结构：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190315162233848.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1cGVyYmV5b25l,size_16,color_FFFFFF,t_70)
执行结果：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190315162113898.png)
[源码地址](https://github.com/superbeyone/design-pattern)