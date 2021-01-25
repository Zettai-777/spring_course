package ru.zettai.spring.aop.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.zettai.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
