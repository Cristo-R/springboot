package com.zhy.boot;
import com.zhy.boot.bean.Pet;
import com.zhy.boot.bean.User;
import com.zhy.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * 一个Springboot应用
 */
@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        //返回容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApp.class, args);
//        //查看容器中的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//        //从容器中获取组件
//        Pet pet = run.getBean("tom", Pet.class);
//        //获取配置对象
//        MyConfig bean = run.getBean(MyConfig.class);
////        如果@Configuration(proxyBeanMethods = true)代理对象调用方法，springboot总会检查这个组件是否在容器中
//        //保持组件单例
//        User user = bean.user01();
        boolean tom = run.containsBean("tom");
        System.out.println(tom);


    }

}
