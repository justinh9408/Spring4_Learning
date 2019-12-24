package com.spring4.MyAnnotationConfig;

import com.spring4.*;
import com.spring4.Conditional.IOSCondition;
import com.spring4.Decorator.Cold;
import com.spring4.Factory.PersonBeanFactory;
import com.spring4.SpringTransaction.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import static sun.plugin.javascript.navig.JSType.URL;

//@ComponentScan

@Conditional(value = {IOSCondition.class})
@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.spring4", includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Cold.class}),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {BookService.class})
        })
})
@EnableAspectJAutoProxy
@EnableTransactionManagement
@PropertySource("db.properties")
@Import(App.class)
public class Main {

    @Autowired
    Environment environment;


    @Scope("singleton")
    @Bean
    DataSource dataSource(@Value("${PASSWORD}")String pwd){
        System.out.println("加载datasource。。。。。");
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty("URL"));
        driverManagerDataSource.setUsername(environment.getProperty("USER"));
        driverManagerDataSource.setPassword(environment.getProperty(pwd));
        driverManagerDataSource.setDriverClassName(environment.getProperty("DRIVER"));
        System.out.println(environment.getProperty("os.name"));
        return driverManagerDataSource;
    }

    @Profile("test")
    @Bean()
    public Person personTest(){
        System.out.println("加载personTest。。");
        return new Person();
    }

    @Profile("dev")
    @Bean()
    public Person personDev(){
        System.out.println("加载personDev。。");
        return new Person();
    }

    @Profile("prod")
    @Bean()
    public Person personProd(){
        System.out.println("加载personProd。。");
        return new Person();
    }

    @Bean
    public PersonBeanFactory personBeanFactory(){
        return new PersonBeanFactory();
    }

    @Bean(initMethod = "init")
    public House house(){
        return new House();
    }

    public static void main(String[] args) {
        //HelloWord he = new HelloWord();

        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
//        helloWorld.hello();
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Person person = (Person) ctx.getBean("person4");
        System.out.println(person);
    }
}