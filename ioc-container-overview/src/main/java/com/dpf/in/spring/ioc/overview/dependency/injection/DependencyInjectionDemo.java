package com.dpf.in.spring.ioc.overview.dependency.injection;

import com.dpf.in.spring.ioc.overview.annotation.Super;
import com.dpf.in.spring.ioc.overview.domain.User;
import com.dpf.in.spring.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * 依赖注入示例
 * @author Pikachues
 * Created 2022/6/1
 */
public class DependencyInjectionDemo {
    public static void main(String[] args) {

//        BeanFactory applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        // 依赖来源一：自定义 Bean
        UserRepository userRepository = applicationContext.getBean("userRepository", UserRepository.class);
        System.out.println(userRepository.getUsers());

        // 依赖来源二：依赖注入（内建依赖）
        BeanFactory beanFactory = userRepository.getBeanFactory(); // null
        System.out.println(userRepository.getObjectFactory().getObject()==applicationContext);

        // 依赖来源三：容器內建 Bean（容器初始化时创建的bean）
        Environment environment = applicationContext.getBean(Environment.class);
        System.out.println(environment);
    }

}
