package com.zhy.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.zhy.boot.bean.Pet;
import com.zhy.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1.配置类里使用@Bean注解在方法上给容器注册组件，默认单例
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods代理bean的方法
 *      Full(proxyBeanMethods = true)
 *      Lite(proxyBeanMethods = false)
 *      组件依赖
 * 4.Import 给容器中自动创建出这两个类型的组件,默认组件名字是全类名
 */

@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
@ConditionalOnBean(name = "tom")
public class MyConfig {

    /**
     * 单例，多次调用方法获取的都是之前注册容器中的单例对象
     * @return
     */
    @Bean //给容器中添加组件，以方法名作为组件的id，返回类型就是组件类型，返回的值就是组件在容器中的实例
    public User user01(){
        User zhangsan = new User("zhangsan", 18, pet01());
        return zhangsan;
    }

//    @Bean("tom")
    public Pet pet01(){
        return new Pet("tomcat");
    }
}
