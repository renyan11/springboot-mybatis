package com.miss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration  //1开启自动配置 
//@ComponentScan  //2开启bean扫描 
//@RestController //3spring mvc的rest控制器方法 
@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}
